package com.te.corejava;



public class VowelCount {

	public static void main(String[] args) {

		String line = "This websitee is Awesome.";
		String str=line.toLowerCase();
	    int vowels = 0;
	   
	    for (int i = 0; i < line.length(); i++) {
	      char ch = str.charAt(i);

	      // check if character is any of a, e, i, o, u
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	        vowels++;
	      
	    }
	    
	    System.out.println("Vowels: " + vowels);
	}
}
