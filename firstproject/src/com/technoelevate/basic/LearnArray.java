package com.technoelevate.basic;

import java.util.ArrayList;
import java.util.Collections;

public class LearnArray {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
			
			
		list.add(56);
		list.add(5);
		list.add(86);
		list.add(76);
		list.add(536);
		list.add(55);
		list.add(53);
		list.add(54);
		list.add(51);
		
//		System.out.println(list);
//		
//		list.remove(2);
//		System.out.println(list);
//		
//		Collections.sort(list);
//		System.out.println(list);
		
//		for (Object obj:list) {
//			System.out.println(obj);
//		}
		
		System.out.println(list);
		
		ArrayList al=new ArrayList();
		al.add("Ikbal");
		al.add("Ikbal");
		al.add("Ikbal");
		al.add("Ikbal");
		al.add("Ikbal");
		al.add("Ikbal");
		
		al.set(2, "iku");
		System.out.println(al);
		
	}

}
