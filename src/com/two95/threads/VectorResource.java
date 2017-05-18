package com.two95.threads;

import java.util.Enumeration;
import java.util.Vector;

public class VectorResource extends Resource{
	
	
	Vector<String> vector = new Vector<String>();
	public Vector<String> createVector() {
		vector.add("Sinsy");
		vector.add("Vinitha");
		vector.add("neha");
		vector.add("Megha");
		return vector;
	}
	
	public void print(int elementId) {
		
		System.out.println(Thread.currentThread().getName() + " is going to access in vector " + vector.get(elementId));
		vector.remove(elementId);
	}
}
