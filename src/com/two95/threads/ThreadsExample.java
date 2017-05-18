package com.two95.threads;

import java.util.Date;

public class ThreadsExample {

	public static void main(String[] args) throws InterruptedException {

		Thread t = Thread.currentThread();
		System.out.println("name of the thread "+t.getName());
//		System.out.println("priority of the thread "+t.getPriority());
//		System.out.println("id of the thread "+t.getId());
//		System.out.println("Is the thread alive? "+t.isAlive());
//		if(t.isAlive()) {
//			System.out.println("Thread is alive");
//		} else {
//			System.out.println("Thread is dead");
//		}
//		String status = t.isAlive()?"YES":"NO";
//		System.out.println("Is the thread alive? "+status);
//				
		System.out.println("<--------------------------------------->");
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		Thread th1 = new Thread(mt1);
		th1.setPriority(10);
		Thread th2 = new Thread(mt2);
		th2.setPriority(2);
		th1.start();
		Thread.sleep(2000);
		th2.start();
		System.out.println("<--------------------------------------->");
		AnotherThread at = new AnotherThread();
		at.start();
		Thread.sleep(2000);
		System.out.println("i am in "+Thread.currentThread().getName() + " at "+ new Date());
		System.out.println("<--------------------------------------->");
		
		
	}

}
