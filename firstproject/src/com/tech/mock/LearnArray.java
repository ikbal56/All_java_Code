package com.tech.mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LearnArray {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(25);
		al.add(27);
		al.add(200);
		al.add(101);
	
		
//		System.out.println(al);
		
//		System.out.println(al);
		
//		for(Object obj:al) {
//			System.out.println(obj);
//		
//		}
		
//		Collections.sort(al); 
	
//		Collections.reverse(al);
		
//		Iterator itr=al.iterator();
//		while(itr.hasNext());
//		System.out.println(itr.next());
		
//		Collections.sort(al,Collections.reverseOrder());
//		   System.out.println(al);
		
		ArrayList li=new ArrayList(al);
		
		li.add(123);
		li.add(12);
		li.add(13);
		
		Collections.copy(li, al);
		System.out.println(li);
		
	}

}
