package com.ameen.thread.basic;

import java.util.Map;

public class FileReader {
	Map<String, String> path;
	
	public void readFile() {
		path.entrySet().forEach(eachEntry -> {
			System.err.println("Reading path from ... " + eachEntry.getValue() + "  using thread " + Thread.currentThread().getName());
		});
	}

	public void setPath(Map<String, String> path) {
		this.path = path;
	}
	
	

	
}
