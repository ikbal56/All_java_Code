package com.te.practice;

import java.util.Scanner;

// print sum of  n=4 that means 1+2+3+4=10
public class Loop {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println( " Enter the number" );
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			 sum=sum+i;
		}
		
		System.out.println(sum);
		
	}

}
