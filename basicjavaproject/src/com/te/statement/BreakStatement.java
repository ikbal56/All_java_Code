package com.te.statement;

public class BreakStatement {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println(i);
			System.out.println("java is awesome language");
			
			if(i==2) {
				System.out.println("Ending the loop");
				break;
			}
		}
		
		
		
		System.out.println("Loop is ended");
	}

}
