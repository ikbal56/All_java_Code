package com.te.rythoms;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static void main(String[] args) {
		
		String str="Ruksar Ikbal";
		
		System.out.println("Before Reverse String: "+str);
		
		System.out.println("After Reverse String: "+ reverseValue(str));
		
	}
	
	public static String reverseValue(String str) {
		
		
		if(str==null||str==" ") {
			
			return str;
		}else {
			
			
			char[] chars=str.toCharArray();
			
			Stack<Character> ch=new Stack<Character>();
			
			for(int i=0;i<str.length();i++) {
				
				ch.push(chars[i]);
				
			}
			
			int k=0;
			
			while(!ch.isEmpty()) {
					
				chars[k]=ch.pop();
				k++;
			}
			
			return String.copyValueOf(chars);
		}
		
		
	}

}
