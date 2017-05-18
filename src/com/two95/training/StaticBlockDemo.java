package com.two95.training;

public class StaticBlockDemo {

	static {
		System.out.println("40% Class is Initialized");
	}

	static {
		System.out.println("Remaining 60% Class is also Initialized");
	}

	public static void main(String args[]) {
		System.out.println("I am in Main");
	}

}
