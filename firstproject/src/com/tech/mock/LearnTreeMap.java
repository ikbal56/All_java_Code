package com.tech.mock;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
	
	public static void main(String[] args) {
		
		//Map<Integer,String> tm=new TreeMap(Collections.reverseOrder());
		Map<Integer,String> tm=new TreeMap();
		
		
		tm.put(3, "Iku");
		tm.put(5, "Raj");
		tm.put(6, "purna");
		tm.put(7, "hossain");
		tm.put(2, "Ikbal");
		System.out.println(tm);
	}

}
