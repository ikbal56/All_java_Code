package com.string;

import java.util.Scanner;

public class VowelCount {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value");
		String str=sc.nextLine();
		String nstr=str.toUpperCase();
		
		int len=str.length();
		int vcount=0;
		
		for(int i=0;i<len;i++) {
			char ch=nstr.charAt(i);
			
			if(ch== 'A'||ch== 'E'||ch=='I'||ch=='O'||ch=='U'){
				vcount++;
			}
					
		}
		
		System.out.println("no of vowel "+ vcount);
		
	}

}
