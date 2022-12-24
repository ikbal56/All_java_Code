package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		
		System.out.println(list);
		
		list.add(56);
		
		System.out.println(list);
		
		list.add(2, 19);
		
		System.out.println(list);
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		
		ls.add(101);
		ls.add(103);
		
		list.addAll(ls);
		
		System.out.println(list);
		list.remove(7);
		System.out.println(list);
		
		// if 3 value in list then it will be delete this element
		list.remove(Integer.valueOf(3));
		System.out.println(list);
		
		// for delete all element
		
		//list.clear();
		
		// for update
		list.set(2, 22);
		
		
		System.out.println(list);
		
		// it will be check element there or not output will be true or false
		
		System.out.println(list.contains(23));
		
		// we can iterate element three way 1st one for loop
		for(int i=0;i<list.size();i++) {
			
			System.out.println("The element is :"+list.get(i));
		}
		
		// 2nd for each
		for(Integer element:list) {
			
			System.out.println(element);
		}
		
		// using iterator
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println( "iterator: "+it.next());
		}
		
		
	}

}
