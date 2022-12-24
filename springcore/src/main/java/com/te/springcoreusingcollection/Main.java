package com.te.springcoreusingcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/springcoreusingcollection/config.xml");
		Student st=context.getBean("student",Student.class);
		//System.out.println(st);
		
		System.out.println("Name:"+st.getName());
		System.out.println("Mobile:"+st.getPhones());
		System.out.println("city:"+st.getAddress());
		System.out.println("course:"+st.getCourses());
		
	}

}
