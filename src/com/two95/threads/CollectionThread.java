package com.two95.threads;

public class CollectionThread extends Thread{
	
	Resource printMe;
	int id;
	
	public CollectionThread(String name, Resource pm, int id) {
		super();
		this.setName(name);
		this.printMe=pm;
		this.id=id;
	}
	
	@Override
	public void run() {
		
		printMe.print(id);
		
	}
	

}
