package com.te.statement;

import java.util.Scanner;

public class Switchs {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int button=sc.nextInt();
		
		switch(button) {
		
		case 1:System.out.println("Hello");
		break;
		case 2:System.out.println("Assalamalikum");
		break;
		case 3:System.out.println("Welcome bro");
		break;
		
		default:System.out.println("Invalid Number");
		
		
		}
	}
	

}
