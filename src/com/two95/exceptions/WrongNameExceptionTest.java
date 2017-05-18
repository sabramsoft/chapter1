package com.two95.exceptions;

public class WrongNameExceptionTest {

	public static void main(String[] args) {
		String[] names = {"Sinsy", "Vinitha", "Megha", "Neha"};
		
		try {
			checkSabarishInNames(names);
		 } catch (WrongNameException e) {
			System.out.println("Wrong name was called "+e.getMessage());
		}

	}
	
	private static void checkSabarishInNames(String[] names) throws WrongNameException {
		
		for(String name : names) {
			System.out.println(name);
			if("Sabarish".equals(name)) {
				System.out.println("Sabarish");
			} else {
				
					throw new WrongNameException("Sabarish is not in the list of names");
				
			}
			
		}
	}
	
	

}
