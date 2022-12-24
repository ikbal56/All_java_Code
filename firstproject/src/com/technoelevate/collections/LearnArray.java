package com.technoelevate.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnArray {

	static ArrayList<String> li = new ArrayList();
	
	public static void main(String[] args) {
		
		
	li.add("purna");
	li.add("harsha");
	li.add("sayeed");
	li.add("raj");
	li.add("rajjak");
	
	ArrayList<String> list=new ArrayList();
	

	list.add("iku");
	list.add("ikbal");
	list.add("Arip");
	list.add("Ruku");
	list.add("Rihab");
	list.add("iku");
	
	list.remove(3);
	System.out.println(list);
	
	//swap two elements
//	Collections.swap(list, 2, 0);
//	System.out.println(list);
	
//	System.out.println("Beforer copy"+li);
//	System.out.println(list);
	
//	copy one arraylist to another
	Collections.copy(list, li);
	System.out.println(list);
	
	
		
//		System.out.println(li);
//		System.out.println("******After sorting*****");
//		Collections.sort(li);
//		System.out.println(li);
//		// reverse elements
//		Collections.sort(li, Comparator.reverseOrder());
//		
//		System.out.println(li);
//		
//		System.out.println(li.get(2));
//		
//		System.out.println(Collections.max(li));
//		System.out.println(Collections.min(li));
	}

}
