package com.te.rythoms;

public class FindMaximumElementArray {
	
	public static void main(String[] args) {
		
		int [] a= {3,1,8,4,9,202,2,31,3,91,2,101,7};
		
		int max=a[0];
	
		for(int i=1;i<a.length;i++) {
			
			if(max<a[i]) {
				
				max=a[i];
				
				
				
			}
		}
		
		System.out.println( "Maximum element: "+max);
	}

}
