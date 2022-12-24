package com.te.starpattern;

public class Triangle {
	
	public static void main(String[] args) {
		
		int n=4;
		for(int i =1;i<=4;i++) {
			
			for(int j=4;j>=1;j--) {
				
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print(" *" );
				}
			}
			
			System.out.println();
		}
	}

}
