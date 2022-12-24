package com.te.rythoms;

import java.util.HashSet;

public class RemoveDuplicateUnsortedArray {
	
	
	
	public static void main(String[] args) {
		
		int[] a= {4,2,6,8,1,1,1,5,5,5,8};
		
		HashSet<Integer> dup=new HashSet<Integer>();	
		
		for(int i=0;i<a.length;i++) {
			
			dup.add(a[i]);
		}
		
		for(int d:dup) {
			
			System.out.println(d);
		}
		
	}

}
