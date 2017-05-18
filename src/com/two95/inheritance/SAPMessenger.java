package com.two95.inheritance;

public class SAPMessenger extends MainframeMessenger{
	
	@Override
	public void sendMessage(String message) {
		formatMessage(message);
		System.out.println("Message" + message + " sent to SAP System");
	}

}
