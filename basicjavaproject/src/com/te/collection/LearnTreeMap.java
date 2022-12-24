package com.te.collection;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new TreeMap<String, Integer>();
		
		map.put("One", 1);
		map.put("Two", 5);
		map.put("Three",6);
		map.put("Four",11);
		
		//System.out.println(map);
		
		//if we want to override then
		
		map.put("one",101);
		
		System.out.println(map);
		
		// if dont want to add duplicate value there are 2 way
		
		// containskey method will be check element is there or not
//		if(!map.containsKey("one")) {
//			map.put("one",101);
//	
//		}
		 
		// value present or not
		
		System.out.println(map.containsValue(5));
		
		//System.out.println(map);
		
		
		// 2nd way
		
//		map.putIfAbsent("two",5);
//		System.out.println(map);
		
		// for iterate map
		for(Map.Entry<String,Integer> e:map.entrySet()) {
			System.out.println(e);
		}
		
		// iterate only key 
		
		for(String key:map.keySet()) {
			System.out.println(key);
		}
		
		// iterate only value
		
		for(Integer value:map.values()) {
			System.out.println(value);
		}
	}

}
