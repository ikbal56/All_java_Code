package com.te.java;

public class CheckPalindrome {

	public static void main(String[] args) {

		int n = 137;

		int temp = n;
		int rem;
		int rev = 0;

		while (n != 0) {

			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		System.out.println(palindrome(rev, temp));
	}

	public static boolean palindrome(int rev, int temp) {

		
		if (temp != rev) {
			return false;
		} else {

			return true;
		}
	}

}
