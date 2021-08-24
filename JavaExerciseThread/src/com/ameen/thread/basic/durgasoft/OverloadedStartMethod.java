package com.ameen.thread.basic.durgasoft;

public class OverloadedStartMethod extends Thread{
	/*
	 * public void start() { for (int i = 0; i < 10; i++) {
	 * System.out.println("Child Thread"); } }
	 */
	
	public void startWithSuper() {
		super.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
