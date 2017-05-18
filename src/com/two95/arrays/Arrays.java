package com.two95.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		
//		String[] students = {"Vinitha","Megha","Neha","Sinsy","Beebarg"};
//		
//		for(int i=0;i<students.length;i++) {
//			System.out.println("At index "+i+" Student is : "+students[i]);
//		}
		
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		
//	     for (double abc: myList) {
//	         System.out.println(abc);
//	      }
	     
	     double max1 = getMaxValue(myList);
	     System.out.println("max1 is "+max1);
	     
	     double[] secondList = {1.1,2.2,1.2,5.6,1.1,1.2,4.5,7.6,3.4,8.9,9.8,1.0};
	     
	    double max2= getMaxValue(secondList);
	    System.out.println("max 2 is "+max2);

	    if(max1>max2) {
	    	System.out.println("max value of these 2 arrays is "+max1);
	    } else {
	    	System.out.println("max value of these 2 arrays is "+max2);
	    }

	}
	
	private static double getMaxValue(double[] input) {
		
		double max = input[0];
		for(int i=0;i<input.length;i++) {
			//System.out.println(myList[i]);
			//sum=sum+myList[i];
			//sum+=myList[i];
			//System.out.println("Sum is "+sum);
			if(input[i]>max){
				max=input[i];
			}
			
		}
		
		return max;
		
	}

}
