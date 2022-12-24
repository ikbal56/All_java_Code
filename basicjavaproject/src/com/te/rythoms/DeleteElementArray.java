package com.te.rythoms;

public class DeleteElementArray {

	public static void main(String[] args) {

		int[] a = { 3, 5, 4, 1, 5, 3, 8 };

		int delete = 1;

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (delete == a[i]) {

				for (int j = i; j < a.length - 1; j++) {

					a[j] = a[j + 1];

				}

				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("Element not found");
		} else {

			System.out.println("Succesfuly deleted");
			for (int j = 0; j < a.length - 1; j++) {

				System.out.println(a[j]);
			}
		}

	}

}
