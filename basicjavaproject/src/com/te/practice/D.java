package com.te.practice;

public class D {

	public static void main(String[] args) {

		int a[] = { 4, 2, 1, 7, 9, 3 };
		int temp;

		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		System.out.println("After sorting sorting");
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
