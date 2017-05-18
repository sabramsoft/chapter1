package com.two95.inheritance;

public class MessengerTest {

	public static void main(String[] args) {

		MainframeMessenger parent = new MainframeMessenger();
		SAPMessenger child = new SAPMessenger();
		parent.sendMessage("Hello World");
		child.sendMessage("Hello World");
	}

}
