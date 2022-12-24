package com.te.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ch {

	public static void main(String[] args) {

		String name = "Ikbal Hossain java developer";

		String str = name.replaceAll(" ","");
		String str2 = str.toLowerCase();

		char[] chars = str2.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : chars) {

			if (charMap.containsKey(ch)) {

				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Character> keys = charMap.keySet();

		for (Character c : keys) {

			if (charMap.get(c) > 1) {

				System.out.println("character " + c + " repeating " + charMap.get(c)+ " times");

			}
		}

	}

}
