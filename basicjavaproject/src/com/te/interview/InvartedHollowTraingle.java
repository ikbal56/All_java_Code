package com.te.interview;

public class InvartedHollowTraingle {
	
	
	public static void main(String[] args) {
		
		int n=9;
		
		for(int i=1;i<=n;i++) {
			
			
			for(int j=1;j<=n;j++) {
				
				if(i+j==n+1||i+j==n+i||i==n) {
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
