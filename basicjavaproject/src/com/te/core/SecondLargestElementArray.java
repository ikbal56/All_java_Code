package com.te.core;

public class SecondLargestElementArray {
	
	
	public static void main(String[] args) {
		
		
		int a[]= {2,8,1,6,9,3};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Second largest Element:"+a[1]);
	}

}
