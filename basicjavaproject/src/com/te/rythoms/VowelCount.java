package com.te.rythoms;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter string value");
		String name=sc.nextLine();
		String value = "I love Allah";

		String str = name.toLowerCase();

		int vowel = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			}

		}

		System.out.println(vowel);

	}

}
