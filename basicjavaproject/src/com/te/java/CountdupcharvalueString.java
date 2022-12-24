package com.te.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountdupcharvalueString {

	public static void main(String[] args) {

		String value = "java developer Ikbal Hossain";
		String str = value.toLowerCase();

		String st = str.replaceAll(" ", "");
		char[] chars = st.toCharArray();

		Map<Character, Integer> charmap = new HashMap<Character, Integer>();

		for (Character ch : chars) {

			if (charmap.containsKey(ch)) {

				charmap.put(ch, charmap.get(ch) + 1);
			} else {

				charmap.put(ch, 1);
			}
		}

		Set<Character> keys = charmap.keySet();

		for (Character chh : keys) {

			if (charmap.get(chh) > 1) {

				System.out.println("character " + chh + " repeating " + charmap.get(chh) + " times ");

			}
		}

	}

}
