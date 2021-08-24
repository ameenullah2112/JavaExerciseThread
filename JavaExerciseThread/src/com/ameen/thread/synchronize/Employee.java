package com.ameen.thread.synchronize;

public class Employee {
	public synchronized void m1() {
		for (int i = 0; i < 10; i++) {
			System.err.println("I am m1 method... Executed by ... " + Thread.currentThread().getName());
		}
	}

	public synchronized void m2() {
		for (int i = 0; i < 10; i++) {
			System.err.println("I am m2 synchronized method... Executed by ... " + Thread.currentThread().getName());
		}
	}

	public void m3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am m3 method... Executed by ... " + Thread.currentThread().getName());
		}
	}
}
