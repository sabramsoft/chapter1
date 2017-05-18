package com.two95.java.utils;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Car toyota = new Car("red","camry", 1);
		Car toyota1 = new Car("blue","corolla", 1);
		Car toyota2 = new Car("white","avalon", 1);
		Car toyota3 = new Car("black","prius", 1);
		Car toyota4 = new Car("gold","camry", 1);
		
		Map<String,Car> carMap = new HashMap<String,Car>();
		carMap.put("camry", toyota);
		carMap.put("corolla", toyota1);
		carMap.put("avalon", toyota2);
		carMap.put("prius", toyota3);
		carMap.put("camry1", toyota4);
		System.out.println("size : "+carMap.size());
		carMap.get("camry").printDetails();
	}

}
