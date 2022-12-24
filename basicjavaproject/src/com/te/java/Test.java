package com.te.java;

public class Test {
	
	public static void main(String[] args) {
		
		int n=1;
		int m=10;
		for(int i=n;i<=m;i++) {
			int count=0;
			if(n%i==0) {
				 count++;
				 
			}
			
			if(count==2) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a prime Number");
			}
		}
	}

}
