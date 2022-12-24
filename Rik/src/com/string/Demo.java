package com.string;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String value");

		String str = sc.nextLine();
		int len = str.length();
		//String nstr = str.toUpperCase();

		for (int i = 0; i < len; i++) {
			
			
			char ch = str.charAt(i);
			if(ch=='e'||ch=='E') {
				
				ch='*';
				
			}
			System.out.print(ch);

		}
		
		System.out.println();

	}

}
