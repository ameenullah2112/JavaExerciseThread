package com.ameen.thread.join;

public class MyThreadJoin2 extends Thread{
	static Thread myThread;
	
	public void run() {
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.err.println("Child Thread");
		}
	}
}
