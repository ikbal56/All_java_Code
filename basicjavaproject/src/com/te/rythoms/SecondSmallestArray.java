package com.te.rythoms;

public class SecondSmallestArray {

	public static void main(String[] args) {

		int[] a = { 7, 9, 2, 1, 55, 23, 11 };

		// System.out.println(a.length);
		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length;j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

			
		}
		System.out.println(a[1]);
		

	}

}
