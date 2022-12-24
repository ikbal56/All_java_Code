package com.te.corejava;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number ");
		int no=sc.nextInt();
		int temp=no;
		int rev=0,rem;
		
		while (no!=0) {
			
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		
	
		
		if (temp==rev) {
			
			System.out.println(temp +" given number is palindromeNumber ");
		} else {
			
			System.out.println(temp+" given number not a palindromeNumber");

		}
	}

}
