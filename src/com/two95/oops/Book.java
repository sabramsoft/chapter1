package com.two95.oops;

public class Book {
	
	private double bookPrice;
	private String bookName;
	private String publisher;
	private int numberOfPages;
	
	public int getNumberOfPages(){
		return numberOfPages;
	}
	
	public void setNumberOfPages(int pages){
		numberOfPages=pages;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisherName){
		publisher=publisherName;
	}
	
	
	
	public String getBookName(){
		return bookName;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}
	
	public void setBookName(String name) {
		System.out.println("Book name set is "+name);
		bookName=name;
	}
	public void setBookPrice(double price){
		
		System.out.println("book price being set is "+price);
		bookPrice=price;
		
	}

}
