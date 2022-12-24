package com.te.rythoms;

public class RemoveDuplicateArray {
	
	public static void main(String[] args) {
		
		int [] arr= {5,2,1,7,9,3,3,3,3,3,3,3,3,3,3};
		
		int[] temp=new int[arr.length];
		
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				temp[j]=arr[i];
				j++;
				
				System.out.println(j);
				System.out.println("*******************");
			}
		}
		
		temp[j]=arr[arr.length-1];
		
		for(int i=0;i<temp.length;i++) {
			
			System.out.println(temp[i]);
		}
	}

}
