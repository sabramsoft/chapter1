package com.two95.threads;

import java.util.Date;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Executing MyThread ->>>" + Thread.currentThread().getName() + " at "+ new Date()+" with priority "+ Thread.currentThread().getPriority());
		
	}

}
