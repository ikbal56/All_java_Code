package com.te.core;

import java.util.HashSet;

public class RemoveDuplicateUnSortedElement {
	
	public static void main(String[] args) {
		
		int a[]= {2,1,7,9,6,3,2,3};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			hs.add(a[i]);
			
			
		}
		
		for(int num:hs) {
			
			System.out.print(num+" ");
		}
	}

}
