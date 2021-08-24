package com.ameen.thread.parallel.processing;

public class MyThread implements Runnable {
	
	private Employee currentEmployee;
	
	MyThread(Employee e){
		currentEmployee = e;
	}
	

	@Override
	public void run() {
		System.out.println(currentEmployee);
//		currentEmployee.setId(1);
		currentEmployee.setName(String.format("New Name Set by Thread %s", Thread.currentThread().getName()));
		currentEmployee.setAddress("Chennai");
		
		System.err.println(currentEmployee);
	}

}
