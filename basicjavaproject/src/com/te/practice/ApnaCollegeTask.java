package com.te.practice;

import java.util.Scanner;

public class ApnaCollegeTask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input;

		do {

			System.out.println("Enter your marks");
			int marks = sc.nextInt();
			
			

			if (marks >= 90 && marks <=100) {

				System.out.println(" This is  Excelent");
			} else if (marks >= 60 && marks <=89) {

				System.out.println("very  good");

			} else if (marks >=25 && marks <= 59) {

				System.out.println("Not Bad You get Average but try to excelent");
				
			} else {

				System.out.println("Please read book every day otherwise your brother will be punch you");
			}

			System.out.println("-------------------------------------------------------------------------");

			
			System.out.println("Want to continue? yes press(1) or if No then Press(0)");
			
			
			input = sc.nextInt();

		} while (input == 1);
		
		System.out.println("Exit");
	}

}
