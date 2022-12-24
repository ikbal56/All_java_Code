package com.te.interview;



public class P {

	public static void main(String[] args) {

		
		int[] a= {3,6,1,4,3,8,8,8};
		
		int[] temp=new int[a.length];
		
		int k=0;
		
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]!=a[i+1]) {
				
				temp[k]=a[i];
				
				k++;
			}
		}
		
		temp[k]=a[a.length-1];
		
		for(int i=0;i<temp.length;i++) {
			
			System.out.println(temp[i]);
		}
	}

}
