
package com.two95.training;

public class Car {

	//state
	public String model;
	public int price;

	// behaviours
	public void driveFast(int speed) {
		System.out.println(model+" is driving at " + speed);
	}

	public int findPrice() {
		return price;
	}

	public static void drive() {
		System.out.println("Car is driving");
	}

}
