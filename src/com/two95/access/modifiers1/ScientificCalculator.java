package com.two95.access.modifiers1;

import com.two95.access.modifiers.Calculator;

public class ScientificCalculator extends Calculator{

public void doScientificCalculations() {
	System.out.println("I am an advanced calculator");
}

public void checkAccess() {
	protectedNumber1=100;
	publicNumber1=200;
	
}

}
