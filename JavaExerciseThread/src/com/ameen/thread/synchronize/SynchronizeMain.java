package com.ameen.thread.synchronize;

public class SynchronizeMain {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		Thread t3 = new Thread(myThread);	
		
		t1.start();
		t2.start();
		t3.start();
	}
}
