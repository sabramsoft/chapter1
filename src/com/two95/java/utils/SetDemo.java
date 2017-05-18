package com.two95.java.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		
//		Set<String> set = new TreeSet<String>();
//		set.add("Vinitha");
//		set.add("Anusha");
//		set.add("1Sinsy");
//		System.out.println("Size--->"+set.size());
//		set.add("Vinitha");
//		System.out.println("Size after adding Vinitha--->"+set.size());
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()){
//			System.out.println(iter.next());
//		}
		
		Car bmw = new Car("white", "535", 10);
		Car bmw1 = new Car("white", "535", 10);
		Car toyota = new Car("yellow", "camry", 5);
		Car honda = new Car("black", "accord", 2);
		Set<Car> carShop = new TreeSet<Car>(new PriceComparator());
		carShop.add(bmw);
		carShop.add(bmw1);
		carShop.add(toyota);
		carShop.add(honda);
		System.out.println("Car shop size is "+carShop.size());
		Iterator<Car> carIterator = carShop.iterator();
		while(carIterator.hasNext()) {
			carIterator.next().printDetails();
		}
	
		
		
	}

}
