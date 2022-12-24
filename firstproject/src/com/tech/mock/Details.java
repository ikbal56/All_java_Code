package com.tech.mock;

import java.util.ArrayList;
import java.util.Collections;

public class Details {

	public static void main(String[] args) {
		
		ArrayList<Student> list =new ArrayList<Student>();
		
		Student st=new Student("Rihab",8,60.0);
		Student st2=new Student("Arip",5,65.0);
		Student st3=new Student("purna",7,70.0);
		
		list.add(st);
		list.add(st2);
		list.add(st3);
		
		Collections.sort(list);
		
		for(Student sb:list) {
			System.out.println(sb);
		}
	}
}
