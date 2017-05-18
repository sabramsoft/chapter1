package com.two95.access.modifiers;

import com.two95.access.modifiers1.ScientificCalculator;

public class ProtectedPerson {
	
	public void checkPublicAccessToCalculator() {
		Calculator c = new Calculator();
		c.publicNumber1=1;
		c.publicCalculate();
	}
	
	public void checkAccessToScientificCalcualtor() {
		ScientificCalculator sc = new ScientificCalculator();
		sc.publicNumber1=1;
		sc.protectedNumber1=2;
		sc.publicCalculate();
		sc.protectedCalculate();
		sc.doScientificCalculations();
	}
	
	public void checkProtectedAccess() {
		Calculator c = new Calculator();
		c.protectedNumber1=2;
		c.protectedCalculate();
	}
	
	public void checkDefaultAccess() {
		Calculator c = new Calculator();
		c.defaultCalculate();
	}
	
	public void checkPrivateAccess() {
		Calculator c = new Calculator();
	}

}
