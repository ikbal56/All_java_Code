package com.te.rythoms;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		int m=5;
		
		int count=0;
		for(int i=1;i<=m;i++) {
			
			if(m%i==0) {
				
				count++;
			}
		}
		
		System.out.println(prime(count));
		
	}
	
	
	public static boolean prime(int count) {
		
		if(count==2) {
			
			return true;
		}else {
			
			return false;
		}
		
	}

}
