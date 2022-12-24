package com.te.interview;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValue {

	public static void main(String[] args) {

		String str = "I am am Ikbal Ikbal";

		String[] arr = str.split(" ");

		Set<String> mySet = new LinkedHashSet<String>();

		for (String x : arr) {

			mySet.add(x);
		}

		Iterator itr = mySet.iterator();

		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");
		}

	}

}
