package com.two95.ppl;

public class Base {
	
	
	static void add(int i, int j){
		int result = i+j;
		System.out.println("Add result is "+result);
	}
	
	static void subtract(int i, int j){
		int result = i-j;
		System.out.println("Subtract result"+result);
	}

	public static void main(String args[]) {
		System.out.println("I am in main method");
		// Call methods from here
		add(4,6);
		payTaxes();
		sayHi();
		hello();
		subtract(15, 5);
		
		
	}

	static void payTaxes() {
		System.out.println("Thanks for Paying taxes");
	}

	static void sayHi() {
		System.out.println("I am in sayHi method");
	}
	
	static void hello() {
		
		System.out.println("Say hello");
	}


}
