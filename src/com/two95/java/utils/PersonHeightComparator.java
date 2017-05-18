package com.two95.java.utils;

import java.util.Comparator;

import com.two95.ppl.Person;

public class PersonHeightComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getHeight().compareTo(o2.getHeight());
	}

}
