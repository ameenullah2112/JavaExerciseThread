package com.ameen.thread.basic;

public class MyTask implements Runnable {
	String path;

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void run() {
		System.err.println("Reading path from ... " + path + "  using thread " + Thread.currentThread().getName());
	}

}
