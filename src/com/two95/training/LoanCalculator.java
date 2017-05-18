package com.two95.training;

public class LoanCalculator {

	static int creditScore;
	static double annualIncome;
	static double approvedAmount;

	static void setCreditScore(int score) {
		// Store the credit score
		creditScore = score;
	}

	static void setAnnualIncome(double income) {
		// Store the annual Income
		annualIncome = income;
	}

	static double getApprovedAmount() {
		// Apply the conditions and determine the approved amount
		if (creditScore < 600 && annualIncome > 60000) {
			approvedAmount = 500;
		} else if (creditScore > 600 && annualIncome < 70000) {
			approvedAmount = 1000;
		} else {
			approvedAmount = 0.0;
		}
		return approvedAmount;
	}
}
