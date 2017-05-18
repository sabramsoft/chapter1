package com.two95.constructor;

public class MobilePhone {
	
	public MobilePhone() {
		
	}
	
	public MobilePhone(String sinsy) {
		this.model = sinsy;
	}
	
	public MobilePhone(String model, double price) {
		this(model);
		this.price = price;
	}
	
	public MobilePhone(String model, double price, String color, boolean isTouchScreen) {
		this(model,price);
		this.color = color;
		this.isTouchScreen = isTouchScreen;
	}
	
	

	



	private String model;
	private double price;
	private String color;
	private boolean isTouchScreen;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public void setTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}

	
}
