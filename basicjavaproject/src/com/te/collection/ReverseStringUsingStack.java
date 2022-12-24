package com.te.collection;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static String reverseValue(String str) {

		if (str == null || str == "") {

			return str;
		} else {

			char[] chars = str.toCharArray();

			Stack<Character> ch = new Stack<Character>();
			for (int i = 0; i <str.length(); i++) {

				ch.push(chars[i]);

			}

			int k = 0;

			while (!ch.isEmpty()) {

				chars[k] = ch.pop();
				k++;
			}

			return String.copyValueOf(chars);
		}

	}

	public static void main(String[] args) {

		String str = "INDIA";

		System.out.println("Before reverse String:" + str);

		System.out.println("After reverse String :" + reverseValue(str));
	}

}
