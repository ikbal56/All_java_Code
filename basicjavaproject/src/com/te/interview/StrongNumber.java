package com.te.interview;

import java.util.HashSet;
import java.util.Set;

public class StrongNumber {
	
	
	public static void main(String[] args) {
		
		
		int n=145;
		int temp=n;
		int rem;
		
		int sum=0;
		while(n!=0) {
			
			int f=1;
			rem=n%10;
			
			for(int i=1;i<=rem;i++) {
				f=f*i;
			}
			
			n=n/10;
			sum=sum+f;
		}
		
		if(temp==sum) {
			System.out.println("strongNumber");
		}else {
			System.out.println("not a Strong");
		}
	}

}
