package com.ameen.thread.synchronize;

public class MyThread implements Runnable {
	Employee e = new Employee();

	public void run() {
		e.m1();
		e.m2();
		e.m3();
	}
}
