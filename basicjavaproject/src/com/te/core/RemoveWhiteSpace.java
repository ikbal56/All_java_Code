package com.te.core;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String str = "Java is Programming language";

		
		//method -1 
		
		char[] chars = str.toCharArray();

		String str1 = "";

		for (int i = 0; i < chars.length; i++) {

			if (chars[i] != ' ') {

				str1 = str1 + chars[i];
			}
		}

		System.out.println(str1);
		

		// Method-2
		
//		String sb="Hii Iku  Bro";
//		
//		String sb1=sb.replaceAll(" ","");
//		
//		System.out.println(sb1);
		
	}

}
