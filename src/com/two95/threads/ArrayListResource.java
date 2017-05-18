package com.two95.threads;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListResource extends Resource{

	ArrayList<String> al = new ArrayList<String>();

	public ArrayList<String> createArrayList() {
		al.add("Sinsy");
		al.add("Vinitha");
		al.add("neha");
		al.add("Megha");

		return al;

	}

	public void print(int elementId) {

		System.out.println(Thread.currentThread().getName() + " is going to access in list " + al.get(elementId));
		al.remove(elementId);
	}

}
