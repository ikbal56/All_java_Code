package com.technoelevate.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkToArray {
	public static void main(String[] args) {
		
		
		LinkedList<String> li=new LinkedList();
		
		li.add("iku");
		li.add("purna");
		li.add("santosh");
		li.add("Arip");
		li.add("sayeed");
		
//		System.out.println(li);
		
		ArrayList al=new ArrayList(li);
		
		for(Object obj:al) {
			System.out.println(obj);
		}
		
	}

}
