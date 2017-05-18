package com.two95.oops;

public class Messenger {

	public void sendMessage(String message,int count) {
		// Invoke the method in the formatter object
		System.out.println("Incoming message is " + message);
		Formatter f = new Formatter();
		String formattedMessage=f.formatMessage(message);
		for (int i = 0; i < count; i++) {
			System.out.println("Message " + formattedMessage + " sent successfully to legacy system inside Messenger");
		}

	}
}
