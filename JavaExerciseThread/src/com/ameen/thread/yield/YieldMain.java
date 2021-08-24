package com.ameen.thread.yield;

public class YieldMain {
	public static void main(String[] args) {
		//System.err.println("Main thread priority " + Thread.currentThread().getPriority());
		Thread t = new Thread(new MyThreadYield());
		t.start();
		for (int i = 0; i < 10; i++) {
			System.err.println("Main thread");
		}
	}
}
