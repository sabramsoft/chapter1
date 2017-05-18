package com.two95.java.utils;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car>{


	@Override
	public int compare(Car o1, Car o2) {
		int compare = Integer.valueOf(o1.getPrice()).compareTo(Integer.valueOf(o2.getPrice()));
		 
		return compare;
	}

}
