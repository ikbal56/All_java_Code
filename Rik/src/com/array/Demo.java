package com.array;

public class Demo {
	
	public static void main(String[] args) {
		
		
		int [] a= {2,6,8,9,1};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[j]=a[i];
					temp=a[i];
					
				}
			}
			
		}
	}

}
