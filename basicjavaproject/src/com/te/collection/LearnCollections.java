package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollections {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(1);
		list.add(66);
		list.add(101);
		list.add(101);
		list.add(101);
		
		System.out.println(Collections.min(list));
		
		System.out.println(Collections.max(list));
		
		System.out.println(Collections.frequency(list,101));
		
		//accending order
	//	Collections.sort(list);
		
		System.out.println(list);
		
		
		// decending order
		
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		
		
		
	}

}
