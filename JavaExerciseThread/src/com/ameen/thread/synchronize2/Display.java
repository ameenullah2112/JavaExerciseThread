package com.ameen.thread.synchronize2;

public class Display {
	public synchronized void wish(String name) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning!!! ");
			Thread.sleep(2000);
			System.err.println(name );
		}
	}
}
