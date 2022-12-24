package com.tech.practice;

import java.util.Collections;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		TreeMap tr=new TreeMap(Collections.reverseOrder());
		
		tr.put(1, "ikbal");
		tr.put(2, "raj");
		tr.put(4, "purna");
		
		System.out.println(tr);
	}
}
