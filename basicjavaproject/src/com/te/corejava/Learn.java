package com.te.corejava;

import java.util.Scanner;

public class Learn {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		
		Double num1=sc.nextDouble();
		
		System.out.println("choose operator:+,-,*,or/");
		 char operator=sc.next().charAt(0);
		 
		 System.out.println("Enter Second number");
		 Double num2=sc.nextDouble();
		 
		 switch(operator) {
		 
		 case'+':

		 Double result=num1+num2;
		 System.out.println(num1+ "+" +num2+ "=" +result);
		 break;
		 case  '-':
			 result=num1-num2;
			 System.out.println(num1+"-"+num2+ "="+result);

			 break;
		 case '*':
			 result=num1*num2;
			 System.out.println(num1+"*"+num2+ "="+result);
			
			 break;
		 case  '/':
			 result=num1/num2;
			 System.out.println(num1+"/"+num2+ "="+result);

			 break;
			 
			 default:
				 System.out.println( "Invalid Operator!!!");

		 }
		
	}

}
