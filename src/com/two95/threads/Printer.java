package com.two95.threads;

public class Printer {

	public void print(String data) {
		System.out.println("Printing " + data + " started");
		try {
			// Sleep for 1 second (Simulating the printing process)
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("Printing " + data + " completed");
	}

}
