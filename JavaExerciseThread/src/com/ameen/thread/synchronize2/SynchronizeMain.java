package com.ameen.thread.synchronize2;

public class SynchronizeMain {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread myThread = new MyThread(d, "Ameen");
		myThread.start();
		myThread = new MyThread(d, "Nisha");
		myThread.start();
	}
}
