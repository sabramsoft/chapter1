package com.two95.java.utils;

import java.util.ArrayList;
import java.util.List;

public class KidWatchingCars {

	public static void main(String[] args) {

		Car honda = new Car("Red", "Accord", 20000);
		Car toyota = new Car("Blue", "Camry", 30000);
		Car bmw = new Car("White", "X5", 70000);
		
		List<Car> collectionOfCars = new ArrayList<Car>();
		collectionOfCars.add(honda);
		collectionOfCars.add(toyota);
		collectionOfCars.add(bmw);
		
		for(Car car : collectionOfCars) {
			car.printDetails();
		}
		
		String javaVersion = printMyName(5);
		System.out.println(javaVersion);
		
	}
	
	public static String printMyName(int version) {
		 System.out.println("My name is Java and my version is "+version);
		  System.out.println("I was made by Sun microsystems");
		  String output = "Java " + version;
		  return output;
		}

}
