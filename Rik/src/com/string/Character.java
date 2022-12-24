package com.string;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character..!");
		char ch=sc.next().charAt(0);
		System.out.println(ch);
	}
}
