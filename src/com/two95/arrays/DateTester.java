package com.two95.arrays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTester {

	public static void main(String[] args) {
		
		Date date = new Date();

		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				String formattedDate = sdf.format( new Date() );
				System.out.println(formattedDate);
				
		}

}
