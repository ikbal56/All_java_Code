package com.te.statement;

import java.util.Scanner;

public class SwitchChar {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Char value");
		
		char ch=sc.next().charAt(0);
		
		char chh=Character.toLowerCase(ch);
		
		
		switch(chh) {
		
		case  'a':System.out.println("Hii");

		break;
		
		case  'b':System.out.println("Hello");
        break;
        
		case  'c':System.out.println("Welcome");

		break;
		
		default:System.out.println("try again");
		
		}
	}

}
