package com.te.rythoms;

public class SecondLargestArray {

	public static void main(String[] args) {

		int[] b = { 3, 5, 8, 1, 88, 23, 11 };
		int temp;

		for (int i = 0; i < b.length; i++) {

			for (int j = i + 1; j < b.length; j++) {

				if (b[i] < b[j]) {

					temp = b[i];
					b[i] = b[j];
					b[j] = temp;

				}
			}

		}
		
		System.out.println(b[1]);

	}

}
