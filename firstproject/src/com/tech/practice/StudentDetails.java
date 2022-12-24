package com.tech.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails {
	
	public static void main(String[] args) {
		
		ArrayList<Student> lis=new ArrayList<Student>();
		
		Student st=new Student("Rajjak",5,65);
		Student st3=new Student("Iku",3,59);
		Student st4=new Student("Arip",7,60);
		
		lis.add(st);
		lis.add(st3);
		lis.add(st4);
		
		Collections.sort(lis,new MyComparator());
		
		for(Student obj:lis) {
			System.out.println(lis);
		}
		
		
	}
	

}
