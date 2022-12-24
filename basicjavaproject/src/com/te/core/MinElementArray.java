package com.te.core;

public class MinElementArray {
	
	
	public static void main(String[] args) {
		
		int a[]= {5,6,2,10,1,7,11};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min) {// 6<5,2<5
				min=a[i]; //2<5
			}
		}
		
		System.out.println("The minimum Element:"+min);
	}

}
