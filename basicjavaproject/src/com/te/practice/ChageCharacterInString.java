package com.te.practice;

import java.util.Scanner;

public class ChageCharacterInString {

	public static void main(String[] args) {

		
		String name="Software Engineer";
		
		int len=name.length();
		
		//String le=name.toUpperCase();
		
		//int vowel=0;
		for(int i=0;i<len;i++) {
			
			char ch=name.charAt(i);
			
			if(ch== 'E'||ch== 'e') {
				
				ch= '*';
			}
			System.out.print(ch);
		}
		
		System.out.println();
	}

}
