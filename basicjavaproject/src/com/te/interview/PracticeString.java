package com.te.interview;

public class PracticeString {
	
	public static void main(String[] args) {
		
		String str="Good Morning";
		
		String[] arr=str.split(" ");
	    String  rev="";
	    
	    for(int i=arr.length-1;i>=0;i--) {
	    	
	    	rev=rev+arr[i]+ " ";
	    }
	    
	    System.out.println(rev);
	}

}
