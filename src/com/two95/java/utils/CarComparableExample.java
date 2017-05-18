package com.two95.java.utils;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CarComparableExample {

	public static void main(String[] args) {
		Car accord = new Car("black","accord", 1);
		Car crv = new Car("blue","crv",2);
		Car city = new Car("red","city", 3);
		Car pilot = new Car("grey","pilot",4);
		
		Set<Car> carTreeSet = new TreeSet<Car>();
		carTreeSet.add(accord);
		carTreeSet.add(pilot);
		carTreeSet.add(city);
		carTreeSet.add(crv);
		
		Iterator<Car> it = carTreeSet.iterator();
		while(it.hasNext()) {
			it.next().printDetails();
		}
		
	}

}
