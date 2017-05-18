package com.two95.java.utils;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> stringList = new LinkedList<String>();
		stringList.add("A");
		stringList.add("B");
		stringList.add("C");
		stringList.add("D");
		System.out.println(stringList);
		stringList.addLast("Z");
		System.out.println(stringList);
		stringList.addFirst("1");
		System.out.println(stringList);
		stringList.addLast("A");
		System.out.println(stringList);
	}

}
