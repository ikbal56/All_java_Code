package com.te.statement;

public class ContinueStatement {
	
	public static void main(String[] args) {
		
		
//		for(int i=1;i<=5;i++) {
//			
//			if(i==2) {
//				
//				System.out.println("Ending the loop");
//				continue;
//			}
//			
//			System.out.println(i);
//			System.out.println("Java is PlatformIndependent language");
//		}
		
		
		int i=0;
		do{
			
			i++;
			if(i==2) {
				System.out.println("Exit only this statement");
				continue;
			}
			
			System.out.println(i);
			System.out.println("Java is great");
		}while(i<5);
	}

}
