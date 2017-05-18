package com.two95.java.utils;

public class JavaUtilsExample {


	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("anusha");
		buffer.append("atluri");
		buffer.insert(6, "@");
		System.out.println(buffer.toString());
		
		StringBuilder sb = new StringBuilder("anusha");
		sb.append("atluri");
		sb.insert(6, "@");
		System.out.println(sb.toString());

	}

}
