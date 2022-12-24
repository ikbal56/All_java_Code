package com.te.pattern;

public class ButterflyPattern {

	public static void main(String[] args) {

		int n = 6;

		// upper part
		for (int i = 1; i <= n; i++) {

			// 1st part
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			// space

			int space = 2 * (n - i);

			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}

			// 2nd part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// Lower part
		for (int i = n-1; i >= 1; i--) {

			// 1st part
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			// space

			int space = 2 * (n - i);

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			// 2nd part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
