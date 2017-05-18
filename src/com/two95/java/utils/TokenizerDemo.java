package com.two95.java.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.two95.ppl.Person;

public class TokenizerDemo {

	public static void main(String[] args) {

		String str = "Neha,Megha,Sinsy,Anusha,Vinitha";
		StringTokenizer st = new StringTokenizer(str, ",");
		List<Person> personList = new ArrayList<Person>();
		Map<String,Person> personMap = new HashMap<String,Person>();
		System.out.println("Initial Size of person list is :: "+personList.size());
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("token--->"+token);
			Person person = new Person();
			person.setName(token);
			personList.add(person);
			personMap.put(token, person);
			
		}
		
		System.out.println("Final Size of person list is :: "+personList.size());
		System.out.println("Final Map is "+personMap);
		
		System.out.println("Keys inside the map"+personMap.keySet());
		StringBuilder sb = new StringBuilder();
		for(String key : personMap.keySet()) {
			sb.append(key);
			sb.append("*");
		}
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println("final *delimited String is "+sb.toString());
		System.out.println("Current Thread name is "+Thread.currentThread().getName());
	}

}
