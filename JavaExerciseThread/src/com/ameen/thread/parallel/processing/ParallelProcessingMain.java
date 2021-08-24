package com.ameen.thread.parallel.processing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelProcessingMain {
	public static void main(String[] args) {
		System.out.println("Time is ----- " + LocalDateTime.now());
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		List<Employee> eList = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			eList.add(new Employee((i+1), "EmployeeName"+i, "EmployeeAddress"+i));
		}
		
		eList.stream().forEach(e->{ executorService.execute(new MyThread(e)); });
		/* 
		 * // shutdown // this will get blocked until all task finish
		 * 
		 * executorService.shutdown(); try {
		 * executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS); }
		 * catch (InterruptedException e) { e.printStackTrace(); }
		 */
		
//		eList.stream().forEach(e->{new MyThread(e).run();});
		System.out.println("After the execution , Time is ----- " + LocalDateTime.now());
	}
}
