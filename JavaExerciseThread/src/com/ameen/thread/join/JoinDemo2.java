package com.ameen.thread.join;

public class JoinDemo2 {
	public static void main(String[] args) {
		MyThreadJoin2.myThread = Thread.currentThread(); // main thread
		MyThreadJoin2 join2 = new MyThreadJoin2();
		join2.start();
		
		for (int i = 0; i < 10; i++) {
			try {
				//Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread");
		}
	}
}
