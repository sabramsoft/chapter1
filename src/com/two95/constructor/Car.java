package com.two95.constructor;

public class Car {
	//default constructor
	public Car() {
	//object initialization
		System.out.println("Inside empty constructor");
		
	}
	
	public Car(String carColor) {
		System.out.println("inside color constructor");
		color=carColor;
	}
	
	public Car(String carColor, double carPrice) {
		
		this(carColor);
		System.out.println("inside color and price constructor");
		price=carPrice;
	}
	
	private String color;
	private double price;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double pr) {
		price=pr;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String clr){
		color=clr;
	}

}
