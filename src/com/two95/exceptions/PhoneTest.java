package com.two95.exceptions;

public class PhoneTest {

	public static void main(String[] args) {

		Phone p = new Phone();
		try {
			p.dial(12345, 12345);
			System.exit(0);
		} catch (WrongNumberException | CallDisconnectedException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("number was dialed");
		}
		try {
			p.dial(12345, 12346);
		} catch (WrongNumberException e) {
			System.out.println(e.getMessage());
		} catch (CallDisconnectedException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("number was dialed");
		} 
	}

}
