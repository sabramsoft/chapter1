package com.two95.constructor;

public class ToyotaCamry extends ToyotaCorolla {

	public ToyotaCamry() {
		super();
		System.out.println("ToyotaCamry default constructor");
	}

	public ToyotaCamry(int price) {

		super(price);
		System.out.println("ToyotaCamry price constructor" + price);
	}

	public void driveFast() {
		System.out.println("Camry can drive Fast");
	}
	

	@Override
	public boolean gpsTracking() {
		
		System.out.println("GPS tracking is enabled in Camry");
		return true;
	}
	
	
}
