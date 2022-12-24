package com.te.rythoms;

public class MinElementArray {
	
	
	
	public static void main(String[] args) {
		
		int[] arr= {7,1,3,9,6,2,105,44,99,};
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(min>arr[i]) {
				min=arr[i];
				
			}
			
		}
		
		System.out.println("Minimum Element: "+min);
		
	}
	

}
