package com.technoelevate.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedToArrayList {

	
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add("iku");
		li.add("arip");
		li.add("iku");
		li.add("raj");
		
		
		//Convert LinkedList to ArrayList in Java
		List<String> l=new ArrayList(li);
		
		
		System.out.println("The ArrayList elements are");
		for(Object obj:l) {
			System.out.println(obj);
		}
		
		
	}
}
