package com.technoelevate.collections;

import java.util.LinkedList;

public class LearnLinked {
	
	public static void main(String[] args) {
		
		LinkedList<Integer>   li=new LinkedList();
		
		li.add(30);
		li.add(3);
		li.add(20);
		li.add(10);
		li.add(50);
		
//		System.out.println(li.getFirst());
//		System.out.println(li.getLast());
		
		 Integer x=li.peek();
		 
		 System.out.println(x);
	}

}
