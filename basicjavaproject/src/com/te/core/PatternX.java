package com.te.core;

public class PatternX {

	public static void main(String[] args) {

		int n = 6;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == j || i + j == n-1) {

					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

}