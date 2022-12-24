package com.te.rythoms;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int n=141;
		int temp=n;
		
		int rem;
		int rev=0;
		
		while(n!=0) {
			
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(palindrome(temp,rev));
		
	}
	
	public static boolean palindrome(int temp,int rev) {
		
		if(temp==rev) {
			return true;
			
		}else {
			return false;
		}
	}

}
