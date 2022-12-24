package com.te.collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		
		ad.offer(10);
		
		// it will be add first
		
		ad.offerFirst(23);
		//add last
		
		ad.offerLast(66);
		
		//remove 
		System.out.println(ad.pollFirst());
		
		
	}

}
