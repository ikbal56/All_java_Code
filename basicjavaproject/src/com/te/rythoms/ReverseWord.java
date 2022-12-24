package com.te.rythoms;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String name="Hello Ikbal";
		String[] str=name.split(" ");
		
		String rev="";
		
		for(int i=str.length-1;i>=0;i--) {
			
		 rev=rev+str[i]+" ";
		}
		
		System.out.println(rev);
	}

}
