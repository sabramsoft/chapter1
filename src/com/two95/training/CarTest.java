package com.two95.training;

public class CarTest {

	public static void main(String[] args) {
	Car honda = new Car();//object instantiation //creating a object
	honda.model="CRV";
	honda.price=25;
	Car ferrari = new Car();
	ferrari.model="ABCD";
	ferrari.price=100;
	Car toyota = new Car();
	toyota.model="camry";
	toyota.price=30;

	System.out.println("Honda price is "+honda.findPrice());
	System.out.println("Ferrari price is "+ferrari.findPrice());
	System.out.println("Toyota price is "+toyota.findPrice());
	
	honda.driveFast(60);
	ferrari.driveFast(120);
	toyota.driveFast(70);
	
	
	}

}
