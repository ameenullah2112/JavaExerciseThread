package com.ameen.thread.basic.durgasoft;

public class ThreadExample1Main {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		for (int i = 0; i < 10; i++) {
			System.err.println("Main Thread");
		}
	}
}
