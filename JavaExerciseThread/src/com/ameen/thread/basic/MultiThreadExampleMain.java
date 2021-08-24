package com.ameen.thread.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadExampleMain {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Map<String, String> activationDatabaseFiles = prepareHashMap();
		activationDatabaseFiles.entrySet().forEach(entry -> {
			MyTask myTask = new MyTask();
			myTask.setPath(entry.getValue());
			executorService.execute(myTask);
		});
		executorService.shutdown();
	}

	private static Map<String, String> prepareHashMap() {
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < 100; i++) {
			map.put("collectionName" + i, "collectionName" + i + ".xml");
		}
		return map;
	}
}
