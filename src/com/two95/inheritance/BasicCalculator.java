package com.two95.inheritance;

public class BasicCalculator {
	
	private double result;
	int price = 20;

	public double sum(double d1, double d2) {
		result = d1 + d2;
		return result;
	}
	
	protected double minus(double d1, double d2) {
		result = d1 - d2;
		return result;
	}
}
