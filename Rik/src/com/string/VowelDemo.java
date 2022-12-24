package com.string;

import java.util.Scanner;

public class VowelDemo {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int len=str.length();
		String nstr=str.toUpperCase();
		int vcount=0;
		
		for(int i=0;i<len;i++) {
			
			char ch=nstr.charAt(i);
			
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				
				vcount++;
				
			}
		}
		
		System.out.println("No of vowel: "+ vcount);
		
	}

}
