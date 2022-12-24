package com.te.rythoms;

public class InsertElementArray {
	
	public static void main(String[] args) {
		
		int [] a={3,1,5,7,9,11,31};
		
		int element=6;
		
		int position=4;
		
		
		for(int i=a.length-1;i>position-1;i--) {
			
			a[i]=a[i-1];
			
		}
		
		a[position-1]=element;
		
		for(int i=0;i<a.length;i++) {
			
			
			System.out.println(a[i]);
		}
	}

}
