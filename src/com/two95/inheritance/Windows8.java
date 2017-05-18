package com.two95.inheritance;

public class Windows8 extends WindowsXP{
	
	private String osName="Windows 8";


	@Override
	public void displayScreen() {
		System.out.println(osName+" displays screen based on monitor size and can support touch screens");
	}
	@Override
	public void controlScreen() {
		System.out.println(osName+" controls screen using touch, keyboard and mouse");
	}
	
	public void touchScreen() {
		System.out.println(osName+" supports touch screen");
	}
	
	@Deprecated
	@Override
	public void providesMSOfficeForFree() {
		System.out.println(osName+" does not provide MS ofice for free");
	}
	@Override
	public void boot() {
		super.boot();
		System.out.println("Enable touch screen");
		
	}

}
