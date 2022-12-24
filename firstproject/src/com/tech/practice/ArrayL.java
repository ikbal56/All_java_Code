package com.tech.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayL {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList();

		al.add(5);
		al.add(51);
		al.add(15);
		al.add(28);
		al.add(50);
		al.add(28);

//		for(Integer obj:al) {
//			System.out.println(obj);
//		
//		}
//		

//		Iterator itr=al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		al.remove(4);
//		System.out.println(al);
//		
//		Collections.sort(al);
//		System.out.println(al);

//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println(al);

//	  List<Integer> tr= al.stream().filter(i->i>50).collect(Collectors.toList());
//	  System.out.println(tr);

//	  List<String> ls=new ArrayList();
//	  ls.add("ikbal");
//	  ls.add("rajjak");
//	  ls.add("sayeed");
//	  ls.add("Sorkar");
//	  
//	  List<String> tp=ls.stream().filter(i->i.startsWith("r")).collect(Collectors.toList());
//	  System.out.println(tp);
//	  

//		Set<Integer> st=new HashSet(al);
//		st.addAll(al);
//		System.out.println(st);
		
		
		List ir=new ArrayList(al);
		ir.add(30);
		ir.add(123);
		ir.add("iku");
		Collections.copy(ir, al);
		System.out.println(ir);
		
	}

}
