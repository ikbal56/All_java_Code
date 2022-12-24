package com.te.corejava;

public class Testm {

	public static void main(String[] args) {

		int m = 3;

		
		for (int i = 1; i <= m; i++) {

			int count = 0;
			
			if (m % i == 0) {

				count++;
			}
			if (count == 2) {
				System.out.println("primenumber");
			} else {
				System.out.println("not a prime number");
			}

		}

	}

}
