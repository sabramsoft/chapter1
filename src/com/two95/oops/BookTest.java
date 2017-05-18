package com.two95.oops;

public class BookTest {

	public static void main(String[] args) {

		//Create a book object
		Book bookObject = new Book();
		// Set the price
		bookObject.setBookPrice(24.99);
		bookObject.setBookName("ABCD");
		bookObject.setNumberOfPages(50);
		bookObject.setPublisher("XYZ");
		// Pass this book object as a parameter and display the price
		displayPrice(bookObject);
		displayBookName(bookObject);
		displayNumberOfPages(bookObject);
		displayPublisherName(bookObject);
	}

	static void displayPrice(Book sabarish) {
		// Read the price
		double price = sabarish.getBookPrice();
		System.out.println(price);
		}
	
	static void displayPrice(String sabarish, int count) {
		// Read the price
		System.out.println("print this"+sabarish);
		}
	
	static void displayPrice() {
		// Read the price
		System.out.println("print this without any argument");
		}
	
	static void displayBookName(Book vineetha) {
		String name=vineetha.getBookName();
		System.out.println(name);
	}
	
	static void displayNumberOfPages(Book bk){
		int page=bk.getNumberOfPages();
		System.out.println(page);
	}
	
	static void displayPublisherName(Book b1){
		
		String pubName=b1.getPublisher();
		System.out.println(pubName);
		
	}
}
