package com.two95.search;

public class PremierSearch {

	public static void main(String[] args) {
		
		System.out.println(" Search started ");
		// Local Search
		search();
		// Other searches
		InternetSearchEngine.search();
		DirectorySearchEngine.search();
		DirectorySearchEngine dir = new DirectorySearchEngine();
		dir.nonStaticSearch();
		System.out.println(" Search Completed ");
	}

	static void search() {
		System.out.println("PremierSearch Found 5 results in Local");
	}

}
