package com.array;

public class FindLargestElement {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=23;
		int c=9;
		
		int max;
		
		
		 max=(a>b)?(a>c?a:c):(b>c?b:c);
		 
		 System.out.println(max);
	}

}
