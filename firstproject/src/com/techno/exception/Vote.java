package com.techno.exception;

public class Vote {

	public static void main(String[] args) {

		int age = 19;
		try {
			if (age < 18) {
				throw new AgeException();
			} else {
				System.out.println("You can vote.....!");
			}
		} catch (AgeException e) {
			e.printStackTrace();
		}

	}
}
