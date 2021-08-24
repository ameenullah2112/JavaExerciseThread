package com.ameen.thread.join;

public class JoinDemo {
	public static void main(String[] args) {
		//System.err.println("Main thread priority " + Thread.currentThread().getPriority());
		Thread t = new Thread(new MyThreadJoin());
		t.start();
		try {
//			t.join();
			t.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.err.println("Main thread");
		}
	}
}
