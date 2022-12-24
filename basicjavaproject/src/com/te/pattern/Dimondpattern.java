package com.te.pattern;

public class Dimondpattern {

	public static void main(String[] args) {

		int n = 4;

		// upper part
		for (int i = 1; i <= n; i++) {

			// space

			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");
			}

			// star

			for (int j = 1; j <= 2 * i - 1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		// Lower part

		for (int i = n-1; i >= 1; i--) {

			// space

			for (int j = 1; j <= n - i; j++) {

				System.out.print(" ");
			}

			// star

			for (int j = 1; j <= 2 * i -1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

}
