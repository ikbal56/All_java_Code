package com.te.d;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int a=0;
		int b=1;
		int c=0;
		
		while(c<=n) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
