package com.two95.inheritance;

public class ScientificCalculator extends BasicCalculator {

	private double result;

	public double multiply(double n, double m) {
		result = n * m;
		return result;
	}

}
