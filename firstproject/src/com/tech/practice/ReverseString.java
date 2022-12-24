package com.tech.practice;

 

import java.util.Set;
import java.util.TreeSet;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="this is hhello world";
		
		Set s=new TreeSet();
		
		for(int i=0;i<str.length();i++) {
	         
	              s.add(str.charAt(i));
		}
		System.out.println(s);
		 
			}
}
