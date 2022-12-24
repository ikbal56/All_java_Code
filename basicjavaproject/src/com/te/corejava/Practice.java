package com.te.corejava;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
	
		int n=234;
		int temp=n;
		int rev=0;
		int rem;
		
		while(n!=0) {
			
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
				
		}
		
		if(temp==rev) {
			System.out.println(temp+" This is Palindrome Number");
		}else {
			System.out.println(temp+" Not a palindrome Number");
		}
	}

}
