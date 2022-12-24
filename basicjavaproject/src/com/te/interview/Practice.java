package com.te.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {

		String name = "my name is Ikbal";
		String str = name.toLowerCase();
		String str2 = str.replaceAll(" ", "");
		char[] chars = str2.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : chars) {

			if (charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch) + 1);
			}else {
				
				charMap.put(ch,1);
			}
		}
		
		Set<Character>keys=charMap.keySet();
		
		for(Character c:keys) {
			
			if(charMap.get(c) >1) {
				
				System.out.println("Character "+c+" Reapting "+charMap.get(c)+" times");
			}
		}

	}
}
