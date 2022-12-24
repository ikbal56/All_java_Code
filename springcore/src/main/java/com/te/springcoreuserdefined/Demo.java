package com.te.springcoreuserdefined;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/springcoreuserdefined/configteacher.xml");
		Teacher tech=context.getBean("teacher",Teacher.class);
		System.out.println(tech);
	}

}
