package com.array;

import java.util.Scanner;

public class Name {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String n[]=new String[10];
		
		System.out.println("Please Enter 10 Names");
		for(int i=0;i<10;i++) {
			n[i]=sc.nextLine();
			
		}
		
		System.out.println("Enter names are Below please look inti this!...");
		for(int i=0;i<=9;i++) {
			System.out.println(n[i]);
		}
		
	}

}
