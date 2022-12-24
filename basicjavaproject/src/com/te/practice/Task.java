package com.te.practice;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		Scanner sp=new Scanner(System.in);
		System.out.println("Enter your gender");

		String gender = sp.nextLine();

		if (gender.equals("male") && (age >= 18)) {

			System.out.println("take bike");
		} else{
			System.out.println("take cycle");
		}

	}

}
