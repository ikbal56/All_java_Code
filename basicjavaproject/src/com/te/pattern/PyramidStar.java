package com.te.pattern;

public class PyramidStar {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			
			//space
			
			for(int j=1;j<=n-1;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
