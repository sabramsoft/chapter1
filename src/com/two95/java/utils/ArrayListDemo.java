package com.two95.java.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// creating the list
		List<String> list = new ArrayList<String>();
		// Adding the objects.
		list.add("Sinsy");
		list.add("Vinitha");
		list.add("Anusha");
		list.add("John");
		for(int i=0;i<list.size();i++) {
			
			if("John".equals(list.get(i))) {
				System.out.println("--->found john");
			} else {
				System.out.println("found "+list.get(i));
			}
		}

	}

}
