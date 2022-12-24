package com.te.corejava;

public class ReverseStringWord {
	
	public static void main(String[] args) {
		
		
		String str="My name is Ikbal";
	      String a[]=str.split(" ");
	      String str1=" ";
	      
	      for(int i=a.length-1;i>=0;i--) {
	    	  
	    	  str1=str1+a[i]+" ";
	      }
	      
	      System.out.println(str1);
	}
	

}
