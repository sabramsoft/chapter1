package com.two95.inheritance;

public class CalculatorTest {

	public static void main(String[] args) {

		BasicCalculator basic = new BasicCalculator();
		double result = basic.sum(3.4, 8.1);
		System.out.println("Basic Calculator Sum--->"+result);
		
		ScientificCalculator scientific = new ScientificCalculator();
		result = scientific.multiply(2.3, 4.3);
		System.out.println("Scientific Calculator Multiply--->"+result);
		result = scientific.sum(2.3, 4.3);
		System.out.println("Scientific Calculator Sum--->"+result);		
		result = scientific.minus(4.1, 1.3);
		System.out.println("Scientific Calculator minus--->"+result);	
		System.out.println("price of scientific is "+scientific.price);
		
		AdvancedCalculator advanced = new AdvancedCalculator();
		System.out.println(advanced.divide(6, 3));
		
		MathCalculator math = new MathCalculator();
		System.out.println(math.price);
				
	}

}
