package com.te.pattern;

public class Triangle {
	
	public static void main(String[] args) {
		
		int n=7;
		
		for(int i=1;i<=n;i++) {
			
			//space
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=2*i-1;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
