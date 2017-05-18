package com.two95.inheritance;

public class WindowsTester {
	
	public static void main(String[] args) {
		
		WindowsXP windowsXP = new WindowsXP();
		windowsXP.controlScreen();
		windowsXP.displayScreen();
		Windows8 windows8 = new Windows8();
		windows8.controlScreen();
		windows8.displayScreen();
		windows8.boot();
	}

}
