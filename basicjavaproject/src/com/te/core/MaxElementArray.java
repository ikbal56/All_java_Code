package com.te.core;

public class MaxElementArray {

	public static void main(String[] args) {

		int a[] = { 3, 5, 1, 8, 9,4,31 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				
				max=a[i];

			}

		}
		
		System.out.println("Maximum element is :"+max);
	}

}
