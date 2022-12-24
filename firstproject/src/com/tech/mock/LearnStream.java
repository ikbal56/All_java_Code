package com.tech.mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LearnStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
	
		al.add("Ikbal");
		al.add("purna");
		al.add("Ikbal");
		
//		List<String> b2=al.stream().filter(i->i.startsWith("I")).collect(Collectors.toList());
//		System.out.println(b2);
		
		List<String> b3=al.stream().filter(i->i.startsWith("I")).collect(Collectors.toList());
		System.out.println(b3);
//		ArrayList<Integer> bk=new ArrayList();
//		bk.add(125);
//		bk.add(10);
//		bk.add(105);
//		bk.add(105);
//		bk.add(15);
//		bk.add(15);
//		
//		List<Integer> tn=bk.stream().filter(i->i>100).collect(Collectors.toList());
//		System.out.println(tn);
////		
//		Set<Integer> ab=new HashSet<Integer>(bk);
//		ab.addAll(bk);
//		System.out.println(ab);
		
	}

}
