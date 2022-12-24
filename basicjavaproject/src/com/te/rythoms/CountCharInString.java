package com.te.rythoms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharInString {
	
	public static void main(String[] args) {
		
		String name="I love my  India";
		
		String str=name.replaceAll(" ","");
		String str2=str.toLowerCase();
		
		char[] chars=str2.toCharArray();
		
		Map<Character,Integer> charMap=new HashMap<Character, Integer>();
		
		for(Character ch:chars) {
			
			if(charMap.containsKey(ch)) {
				
				charMap.put(ch,charMap.get(ch)+1);
				
			}else {
				
				charMap.put(ch, 1);
			}
		}
		
		Set<Character> keys=charMap.keySet();
		
		for(Character c:keys) {
			
			if(charMap.get(c)>1) {
				
				System.out.println("Character "+c+ " repeating "+charMap.get(c)+ " time");
				
				
			}
		}
	}

}
