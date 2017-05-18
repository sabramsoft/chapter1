package com.two95.training;

public class LoanCalculatorTest {

	public static void main(String[] args) {

		// Pass the details
		LoanCalculator.setCreditScore(599);
		LoanCalculator.setAnnualIncome(65000.00);
		// Get the results
		double amount = LoanCalculator.getApprovedAmount();
		System.out.println("Approved Amount = $" + amount);
	}

}
