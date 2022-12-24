package com.te.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(10);
		list.add(11);
		list.add(6);
		
		//print even number without using stream api
		
		//ArrayList<Integer> list2=new ArrayList<Integer>();
//		for(Integer i:list) {
//			
//			if(i%2==0) {
//				
//				
//				list2.add(i);
//			 
//			}
//		}
//		System.out.println(list2);
		
		// with stream api
		Stream<Integer> stream=list.stream();
		
		List<Integer> list3=stream.filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(list3);
		
		List<Integer> newlist=list.stream().filter(i->i>10).collect(Collectors.toList());
		
		System.out.println(newlist);
		
		
	}

}
