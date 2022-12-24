package com.te.rythoms;

public class RemoveDuplicateValueString {

	public static void main(String[] args) {

		String[] str = { "java", "python","rubi","java" };
		

		boolean flag = false;
		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {

					System.out.println("duplicate found: " + str[i]);

					flag = true;

				}
			}
		}

		if (flag == false) {
			System.out.println("duplicate not found");
		}
	}

}
