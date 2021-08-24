package com.ameen.thread.basic.durgasoft;

public class ThreadExample1Main2 {
	public static void main(String[] args) {
		OverloadedStartMethod myThread = new OverloadedStartMethod();
		myThread.setPriority(10);
		myThread.startWithSuper();		
		for (int i = 0; i < 10; i++) {
			System.err.println("Main Thread");
		}
	}
}
