package com.te.rythoms;

public class SortArray {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 3, 7, 1, 9 };

		int temp;
		System.out.println("Before sort the element");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		System.out.println("After sort the element");

		for (int sort : arr) {
			System.out.print(sort+" ");
		}

	}
}
