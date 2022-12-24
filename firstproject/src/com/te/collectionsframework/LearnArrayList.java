package com.te.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(21);
		list.add(1);
		list.add(25);
		list.add(7);
		
		//System.out.println(list);
		
//		list.add(1, 31);
//		System.out.println(list);
//		
//		List<Integer> newlist=new ArrayList<Integer>();
//		newlist.add(3);
//		newlist.add(5);
//		
//		
//		list.addAll(newlist);
//		System.out.println(list);
//		
//		System.out.println(list.get(1));
//		
//		list.remove(1);
//		System.out.println(list);
//	    System.out.println(list.contains(21));
//	    
//	    for (int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//	    System.out.println("******** ");
//	    for (Integer element: list) {
//			System.out.println(element);
//		}
//	    
//	    Iterator<Integer> it=list.iterator();
//	    while (it.hasNext()) {
//			System.out.println( it.next());
//			
//		}
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}

}
