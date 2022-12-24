package com.te.core;

public class SecondLowestElement {
	
	public static void main(String[] args) {
		
		//int[] a=new int[5];
		
		int a[]= {3,7,5,1,9};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
		
		
		System.out.println("Second smallest element:"+a[1]);
	}

}
