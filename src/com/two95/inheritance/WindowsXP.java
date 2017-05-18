package com.two95.inheritance;

public class WindowsXP {
	
	
	private String osName="Windows XP";
	
	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public void displayScreen() {
		System.out.println(osName+" displays screen based on monitor size");
	}
	
	public void controlScreen() {
		System.out.println(osName+" controls screen using keyboard and mouse");
	}
	
	public void providesMSOfficeForFree() {
		System.out.println(osName+" provices MS ofice for free");
	}
	
	/**
	 * boot is same as startup of an OS
	 */
	public void boot() {
		System.out.println("start the windows bar");
		System.out.println("initialize the drivers");
		System.out.println("enable date/time");
	}

}
