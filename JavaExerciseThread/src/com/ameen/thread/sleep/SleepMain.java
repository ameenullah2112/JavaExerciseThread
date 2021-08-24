package com.ameen.thread.sleep;

import com.ameen.thread.sleep.interrupt.MySleepThread;

public class SleepMain {
	public static void main(String[] args) throws InterruptedException {
		MySleepThread mySleepThread = new MySleepThread();
		mySleepThread.start();
		//mySleepThread.interrupt();
		System.err.println("Main thread");
	}
}
