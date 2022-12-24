package com.te.practice;

import java.util.Scanner;

public class Basic {
	
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int N=scanner.nextInt();
		

        if (N%10==0 && N>=2 && N<=20 ) {
            
            System.out.println("Weird");
            
        } else{
            System.out.println("Not Weird");
            
        }
		
		
	}
}
