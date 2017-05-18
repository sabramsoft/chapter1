package com.two95.access.modifiers;
import java.util.Date;

public class Calculator {
	
	public int publicNumber1;
	protected int protectedNumber1;
	private int privateNumber1;
	
	public  void publicCalculate() {
		System.out.println("do the PUBLIC calculation"+publicNumber1);
	}
	
	public  void protectedCalculate() {
		System.out.println("do the PROTECTED calculation"+protectedNumber1);
	}
	
	private  void privateCalculate() {
		System.out.println("do the PRIVATE calculation"+privateNumber1);
	}
	
	 void defaultCalculate() {
		System.out.println("do the DEFAULT calculation");
	}

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
		sum = sum + i;
		}
		System.out.println(sum);
		Date today = new Date();
		System.out.println(today);

	}

}
