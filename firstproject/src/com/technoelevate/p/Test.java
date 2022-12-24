package com.technoelevate.p;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList();
		
		list.add(123);
		list.add(12);
		list.add(13);
		list.add(101);
		list.add(153);
		list.add(200);
		
		List<Integer> tl=list.stream().filter(i->i>100).collect(Collectors.toList());
		System.out.println(tl);
	}

}
