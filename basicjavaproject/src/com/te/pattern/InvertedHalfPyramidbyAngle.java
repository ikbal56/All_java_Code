package com.te.pattern;

import java.util.Scanner;

public class InvertedHalfPyramidbyAngle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
		// for no of rows
		for(int i=1;i<=n;i++) {
			
			// for space
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
