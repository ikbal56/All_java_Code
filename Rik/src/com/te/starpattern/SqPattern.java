package com.te.starpattern;

import java.util.Scanner;

public class SqPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number how many star you want to print");

		int n = sc.nextInt();

		String str = "";

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
					//str += "*";
					str=str+"*";
				} else if (j == 0 || j == n - 1) {
					str += "*";
				} else {
					str += " ";
				}
			}

			System.out.println(str);
			str = "";
		}

	}

}
