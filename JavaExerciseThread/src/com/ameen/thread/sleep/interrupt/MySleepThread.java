package com.ameen.thread.sleep.interrupt;

public class MySleepThread extends Thread{
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Im a lazy thread... " + i+1);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.err.println("Child thread got interrupted.");
		}
	}
}
