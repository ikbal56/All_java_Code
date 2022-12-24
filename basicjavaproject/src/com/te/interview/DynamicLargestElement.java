package com.te.interview;

public class DynamicLargestElement {
	
	public static void main(String[] args) {
		
		int [] arr= {3,1,4,11,56,31,6,5};
		int [] b= {4,11,6,7,23,111,7};
		
		System.out.println(getLargest(arr,1));
		System.out.println(getLargest(b,2));
            
	}
	
	
	public static int getLargest(int[] arr,int total) {
		
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr[total-1];
		
	}

}
