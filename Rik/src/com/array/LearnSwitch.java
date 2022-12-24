package com.array;

import java.util.Scanner;

public class LearnSwitch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		System.out.println("Enter 2nd number");
		int b = s.nextInt();

		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice.....!");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("sum " + (a + b));
			break;
		case 2:
			System.out.println("sub " + (a - b));
			break;
		case 3:
			System.out.println("multi " + (a * b));
			break;
		case 4:
			System.out.println("div " + (a / b));
		default:
			System.out.println("Invalid choice.......");

		}
	}

}
