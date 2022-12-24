package com.te.springpureannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		CollegeStudent student=context.getBean("getStudent",CollegeStudent.class);
		System.out.println(student);
		student.study();
		 
	}

}
