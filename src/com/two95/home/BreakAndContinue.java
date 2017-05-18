package com.two95.home;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		System.out.println("BREAK EXAMPLE START");
	    for(int i=0;i<10;i++)
	    {
	        if (i==4)
	        {
	        	//System.out.println("Exit at 4");
	            break;
	        }
	        System.out.print(i+"\n");

	    }
		System.out.println("BREAK EXAMPLE END");
	    System.out.println("----------------------");
		System.out.println("CONTINUE EXAMPLE START");
	    for(int i=0;i<10;i++)
	    {

	        if (i==4)
	        {
	        	//System.out.println("Skip 4");
	            continue;
	        }
	        System.out.print(i+"\n");
	    }
	    
		System.out.println("CONTINUE EXAMPLE END");
	}

}
