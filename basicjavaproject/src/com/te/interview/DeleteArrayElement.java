package com.te.interview;

public class DeleteArrayElement {
	
	public static void main(String[] args) {
		
		int[] a= {3,1,6,4,8,99,101};
		
		int delete=8;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==delete) {
				
				for(int j=i;j<a.length-1;j++) {
					
					a[j]=a[j+1];
				}
			}
		}
		
		for(int i=0;i<a.length-1;i++) {
			
			System.out.println(a[i]);
		}
		
	}

}
