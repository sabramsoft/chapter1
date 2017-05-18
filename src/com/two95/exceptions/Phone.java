package com.two95.exceptions;

public class Phone {
	
	public void dial(int phoneNumber, int dialedNumber) throws WrongNumberException, CallDisconnectedException {
		
		if(phoneNumber == dialedNumber) {
			System.out.println("Dialed the number successfully");
			throw new CallDisconnectedException("Call got disconnected due to coverage problems");
			
		} else {
			System.out.println("number was wrong , throwing WrongNumberException");
			throw new WrongNumberException("Dialed number was " + dialedNumber + " but expected phone number was " + phoneNumber);
		}
	}


}
