package com.te.corejava;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n=370;
		int temp=n;
		int res=0;
		int rem=0;
		
		while (n!=0) {
			
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
			
		}
		
		if (temp==res) {
			System.out.println(temp+" this is ArmstrongNumber ");
			
		} else {
			
			System.out.println(temp+" Not a ArmstrongNumber ");

		}
		
	}

}
