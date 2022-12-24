package com.te.rythoms;

import java.util.Scanner;

public class StringP {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Something");
		String name=sc.nextLine();
		
		int len=name.length();
		
		for(int i=0;i<len;i++) {
			
			char ch=name.charAt(i);
			
			if(ch=='e'||ch=='E') {
				
				ch='*';
				
			}
			
			System.out.print(ch);
		}
		
		System.out.println();
	}

}
