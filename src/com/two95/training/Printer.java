package com.two95.training;

public class Printer {

	static int paperCount = -1;
	static void print() {
		if (paperCount < 0) {
			paperCount = paperCount - 1;
			System.out.println("Document printed");
		} else {
			System.out.println("Please load the paper in the tray");
		}
		System.out.println("Paper count is "+paperCount);
	}

	void printDocument() {
		print();
	}

}
