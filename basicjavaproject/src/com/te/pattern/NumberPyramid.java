package com.te.pattern;

public class NumberPyramid {
	
	public static void main(String[] args) {
		
		int n=7;
		
		for(int i=1;i<=n;i++) {
			
			//space
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//number
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
