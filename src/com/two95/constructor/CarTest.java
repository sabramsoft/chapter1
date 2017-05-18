package com.two95.constructor;

public class CarTest {

	public static void main(String[] args) {

		Car emptyCar = new Car();
		System.out.println(emptyCar.getColor());
		
		Car blackCar = new Car("black");
		System.out.println(blackCar.getColor());
		
		Car blackCostlyCar = new Car("black", 34000.50);
		System.out.println(blackCostlyCar.getColor() + " car is "+ blackCostlyCar.getPrice() + " dollars");
	}

}
