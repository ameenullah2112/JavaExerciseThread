package com.ameen.thread.sleep.interrupt;

public class SleepMain {
	public static void main(String[] args) throws InterruptedException {
		//System.err.println("Main thread priority " + Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.err.println("Slide - " + (i+1));
			Thread.sleep(2000);
		}
	}
}
