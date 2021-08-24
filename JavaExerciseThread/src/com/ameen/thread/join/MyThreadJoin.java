package com.ameen.thread.join;

public class MyThreadJoin implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				
			}
		}
	}
}
