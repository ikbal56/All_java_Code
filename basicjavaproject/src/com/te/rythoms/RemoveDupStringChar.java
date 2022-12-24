package com.te.rythoms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupStringChar {
	
	public static void main(String[] args) {
		
		String str="javaa";
		
		System.out.println(removeDuplicate(str));
		
	}
	
	
	public static String removeDuplicate(String str) {
		

		Set<Character> s=new HashSet<Character>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			
			Character c=str.charAt(i);
			if(!s.contains(c)) {
				s.add(c);
				sf.append(c);
			}
		}
		
		return sf.toString();
		
	}

}
