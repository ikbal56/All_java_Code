package com.te.collection;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
	
	public static void main(String[] args) {
		// linkedHashSet it will maintain order
		//but HashSet not maintain order
		Set<Integer> st=new HashSet<Integer>();
		
		st.add(23);
		st.add(2);
		st.add(33);
		st.add(23);
		st.add(56);
		
		System.out.println(st);
		
		System.out.println(st.remove(2));
		
		System.out.println(st);
		
		//it will be check element present or not
		
		System.out.println(st.contains(56));
		
		//it will be check element is empty or not
		
		System.out.println(st.isEmpty());
		
		// clear all element
		st.clear();
		
		System.out.println(st);
		
	}

}
