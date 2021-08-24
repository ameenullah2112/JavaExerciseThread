package com.ameen.thread.yield;

public class MyThreadYield implements Runnable{
	public void run() {
		//System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			Thread.yield();
		}
	}
}
