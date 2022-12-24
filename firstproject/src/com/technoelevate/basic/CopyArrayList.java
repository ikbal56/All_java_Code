package com.technoelevate.basic;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {

	public static void main(String[] args) {
//		ArrayList<Integer> al=new ArrayList();
//		al.add(9);
//		al.add(8);
//		al.add(4);
//		al.add(93);
//		al.add(45);
//		al.add(9);
		
		
		ArrayList<String> as=new ArrayList();
		as.add("iku");
		as.add("ruku");
		as.add("arip");
		as.add("rihab");
//		as.add(5);
//		as.add(9);
		
		
		
		
		Collections.swap(as, 0, 3);//swap two elements
		System.out.println(as);
		
//		System.out.println("Before copy"+al);
//		System.out.println(as);
		
//		Collections.copy(al, as);
//		System.out.println("After copy"+al);
//		
	}
	
}
