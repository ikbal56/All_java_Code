package com.te.rythoms;

public class ArrysProgram {

	public static void main(String[] args) {

		int[] a = { 3, 1, 5, 7, 8, 33, 11 };

		int delete = 11;

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
			System.out.println("Element not Found");
		} else {

			System.out.println("Element successfully deleted");

			for (int j = 0; j < a.length-1; j++) {
				System.out.println(a[j]);
			}
		}
	}

}
