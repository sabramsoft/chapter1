package com.two95.constructor;

public abstract class ToyotaCorolla {
	
	public final int numberOfPassengers = 4;
	
	public ToyotaCorolla() {
		System.out.println("ToyotaCorolla default constructor");
	}
	
	public ToyotaCorolla(int carPrice) {
		System.out.println("ToyotaCorolla price constructor");
		this.price=carPrice;
	}
	
	public abstract boolean gpsTracking();
	
	public final void automaticGearChange() {
		System.out.println("In Corolla the gear changes automatically");
	}

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void drive() {
		System.out.println("Corolla can drive Normal");
	}

}
