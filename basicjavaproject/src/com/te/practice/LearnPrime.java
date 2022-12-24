package com.te.practice;

import java.util.Scanner;

public class LearnPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");

		int m = sc.nextInt();

		System.out.println("Enter the Second number");
		
		int n = sc.nextInt();

		int i, j;

		for (i = m; i <= n; i++) {

			for (j = 2; j <= i; j++) {

				if (i % j == 0)
					
					break;

			}

			if (i == j) {
				System.out.println(j + " ");
			}
		}

	}

}
