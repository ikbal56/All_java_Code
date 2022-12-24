package com.te.collection;

import java.util.HashSet;

public class StudentHash {
	
	public static void main(String[] args) {
		
		HashSet<Student> student=new HashSet<Student>();
		
		student.add(new Student("Rihab",1));
		student.add(new Student("Sohan",3));
		student.add(new Student("Arish",1));
		
		System.out.println(student);
	}

}
