package com.two95.oops;

public class Formatter {

	public String formatMessage(String msg) {
		
		System.out.println(" Message "+ msg+" formatted inside Formatter");
		msg="<<"+msg+">>";
		return msg;
		}
	
}
