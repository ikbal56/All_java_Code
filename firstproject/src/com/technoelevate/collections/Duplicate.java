package com.technoelevate.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {
	
	public static void main(String[] args) {
		ArrayList<Integer>  al=new ArrayList();
		
		al.add(25);
		al.add(23);
		al.add(2);
		al.add(5);
		al.add(25);
		
		
		HashSet<Integer>  dup=new HashSet();
		dup.addAll(al);
		System.out.println(dup);
	}

}
