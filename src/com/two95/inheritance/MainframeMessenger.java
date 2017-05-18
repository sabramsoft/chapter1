package com.two95.inheritance;

public class MainframeMessenger {

	public void formatMessage(String str) {
		System.out.println("Message Formatted");
	}

	public void sendMessage(String message) {
		formatMessage(message);
		System.out.println("Message" + message + " sent to Mainframe");
	}
}
