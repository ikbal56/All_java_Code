package com.te.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a[] = { 3, 2, 5, 8, 1 };
		int temp;
		System.out.println("Before the element");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After the element");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}
}
