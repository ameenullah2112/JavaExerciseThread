package com.ameen.thread.synchronize2;

public class MyThread extends Thread {

	private Display d;
	private String name;

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
