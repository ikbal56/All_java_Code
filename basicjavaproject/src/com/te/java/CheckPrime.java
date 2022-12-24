package com.te.java;

public class CheckPrime {

	public static void main(String[] args) {

		int n = 3;
		int count = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {

				count++;
			}
		}

		System.out.println(prime(count));

	}

	public static boolean prime(int count) {

		if (count != 2) {

			return false;
		} else {
			return true;
		}

	}

}
