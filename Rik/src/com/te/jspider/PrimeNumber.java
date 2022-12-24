package com.te.jspider;

public class PrimeNumber {
public static void main(String[] args) {
	int num=3; 
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0)
			count++;
	}
	if (count==2)
		System.out.println(num+" Prime Number");
	else
		System.out.println(num+" Not a Prime Number");
}
}
