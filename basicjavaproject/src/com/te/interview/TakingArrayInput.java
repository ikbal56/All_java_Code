package com.te.interview;

import java.util.Scanner;

public class TakingArrayInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {

			System.out.println("Enter the element");
			array[i] = sc.nextInt();

		}

		System.out.println("printing array element");
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

	}

}
