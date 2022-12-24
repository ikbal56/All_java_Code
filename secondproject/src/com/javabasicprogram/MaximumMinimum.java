package com.javabasicprogram;


public class MaximumMinimum {
	
	public static void main(String[] args) {
		
		//find maximum number of array
//		int a[]= {30,101,50,65};
//		int max=a[0];
//		
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		
//		System.out.println(max);
		
		
		//find minimum number of array
		int a[]= {40,39,7,5,11};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
