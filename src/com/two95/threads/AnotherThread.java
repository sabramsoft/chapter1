package com.two95.threads;

import java.util.Date;

public class AnotherThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Executing AnotherThread ->>>" + Thread.currentThread().getName() + " at "+ new Date()+" with priority "+ Thread.currentThread().getPriority());
	}

}
