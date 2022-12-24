package com.te.rythoms;

public class ReverseStringWord {
	
	
	
	public static void main(String[] args) {
		
		String str= "My name is Ikbal hossain";
		
		String [] chars=str.split(" ");
		
		String rev= "";
		
		for(int i=chars.length-1;i>=0;i--) {
			
			rev=rev+chars[i]+" ";
		}
		
		System.out.println(rev);
		
	}
	
	 

}
