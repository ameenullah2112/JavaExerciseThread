package com.ameen.thread.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {
	public static void main(String[] args) {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.err.println(availableProcessors);
		ExecutorService executorService = Executors.newFixedThreadPool(availableProcessors);
			executorService.execute(new MyTask());
			executorService.shutdown();
		
	}
}
