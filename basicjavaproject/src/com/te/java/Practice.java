package com.te.java;

public class Practice {

	public static void main(String[] args) {

	
		String name="I love Allah";
		String len=name.toLowerCase();
		int vowels=0;
		
		for(int i=0;i<name.length();i++) {
			
			char ch=len.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
				
			}
		}
		
		System.out.println("vowels:"+vowels);
	}

}
