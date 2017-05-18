package com.two95.training;

public class JavaTraining {

	static {
		System.out.println(" Step 1: Read the text book");
	}

	static {
		System.out.println("Step 2: revise previous classes");
	}

	static {
		System.out.println("Step 3: practice examples");
	}

	static {
		System.out.println("Step 4: Finish assignments");
	}

	static {
		System.out.println("Step 5: Be on time");
	}

	public static void main(String[] args) {
		System.out.println("--------------------------");
		duringTheSession();
		System.out.println("--------------------------");
		afterTheSession();

	}

	static void afterTheSession() {
		System.out.println("Step 8 : Finish the session");
		System.out.println("Step 9 : Watch the video or revise the session");
		System.out.println("Step 10 : Complete Assignments");
	}

	static void duringTheSession() {
		System.out.println("Step 6 : Attend the session");
		System.out.println("Step 7 : Interact and understand the session");
	}

}
