package com.two95.exceptions;

import java.io.IOException;

public class KeyBoardMouseIOException {

	public static void main(String[] args) {
		
		
		System.out.println("Buy a keyboard and mouse");
		System.out.println("Connect it to computer");
		try {
			System.out.println("Connection failed");
			IOException io2 = new IOException("Keyboard and Mouse Connection failed");
			throw io2;
		} catch (IOException e) {
			System.out.println("IO exception handled"+e.getMessage());
		}
		System.out.println("Process finished");
		
	}

}
