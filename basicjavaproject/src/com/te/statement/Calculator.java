package com.te.statement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");

		int a = sc.nextInt();

		System.out.println("Enter the second number");
		int b = sc.nextInt();

		System.out.println("Enter number which operation you want to perform");
		int operator = sc.nextInt();

		switch (operator) {

		case 1:
			System.out.println("Addition:" + (a + b));
			break;

		case 2:
			System.out.println("Multiplication:" + (a * b));
			break;

		case 3:
			System.out.println("Sub:" + (a - b));
			break;

		case 4:
			if (b == 0) {
				System.out.println("Invalid Division");
				break;
			} else {
				System.out.println("module:" + (a / b));
				break;
			}
		case 5:
			if (b == 0) {
				System.out.println("Invalid Division");
				break;
			} else {
				System.out.println(a % b);
				break;
			}

		default:
			System.out.println("Please enter valid number");

		}
	}

}
