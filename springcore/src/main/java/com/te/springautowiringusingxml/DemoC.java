package com.te.springautowiringusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoC {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/springautowiringusingxml/configautowire.xml");
		Employee em=context.getBean("employee",Employee.class);
		System.out.println(em);

	}

}
