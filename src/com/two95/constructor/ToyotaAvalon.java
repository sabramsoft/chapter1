package com.two95.constructor;

public  class ToyotaAvalon extends ToyotaCamry{
	
	public ToyotaAvalon() {
		System.out.println("ToyotaAvalon default constructor");
	}
	
	public ToyotaAvalon(int price) {
		super(price);
		System.out.println("ToyotaAvalon price constructor"+price);
	}


	public void driveFaster() {
		System.out.println("Avalon can drive faster");
	}
	
	public  String hasLaneDetection() {
		return "avalon";
	}

}
