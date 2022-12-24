package com.te.corejava;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> pantry=new HashMap<String, Integer>();
		pantry.put("Apples",3);
		//pantry.put("Apples",1);
		//pantry.put("Oranges",2);
		
		int currentApples=pantry.get("Apples");
		pantry.put( "Apples",currentApples+4);
		System.out.println(pantry.get("Apples"));
	}

}
