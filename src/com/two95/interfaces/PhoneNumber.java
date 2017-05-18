package com.two95.interfaces;

public class PhoneNumber {
	
	String name;
	int areaCode;
	String number ;

	public PhoneNumber(String name, int areaCode, String number) {
		super();
		this.name = name;
		this.areaCode = areaCode;
		this.number = number;
	}
	

	public PhoneNumber() {
	}


	public static void main(String[] args) {

//		PhoneNumber ph = new PhoneNumber();
//		String number = ph.getNumber();
//		// Invoke the inherited method
//		String str = ph.toString();
//		System.out.println(str);
//		System.out.println(number);
		
		PhoneNumber megha = new PhoneNumber("megha", 12345, "12345678");
		PhoneNumber neha = new PhoneNumber("neha", 12345, "987654321");
		System.out.println(megha.toString());
		System.out.println("---------------------------");
		System.out.println(neha.toString());
	}


	@Override
	public String toString() {
		return "PhoneNumber [name=" + name + ", areaCode=" + areaCode + ", number=" + number + "]";
	}

}
