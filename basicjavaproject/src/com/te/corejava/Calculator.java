package com.te.corejava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the First Number");
			Double num1=sc.nextDouble();
			System.out.println("Choose Operator:+,-,*,/,%");
			String op=sc.next();
			System.out.println("Enter the Second Number");
			Double num2=sc.nextDouble();
			
			
			if(op.equals("+"))
				System.out.println(num1+num2);
			else if(op.equals("-"))
				System.out.println(num1-num2);
			
			else if(op.equals("*"))
				System.out.println(num1*num2);
			
			else if(op.equals("/"))
				System.out.println(num1/num2);
			else if(op.equals("%"))
				System.out.println(num1%num2);
		}
		
	}
}
