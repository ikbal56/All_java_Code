package com.technoelevate.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(4);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		Set<Integer> dup=new HashSet();
		dup.addAll(list);
		System.out.println(dup);
	}
	
}
