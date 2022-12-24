package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/springcore/configstu.xml");
		Emp em=context.getBean("employeeDetails",Emp.class);
		System.out.println(em);
		
		Emp em2=context.getBean("employee",Emp.class);
		System.out.println(em2);
		
		Emp em3=context.getBean("employee2",Emp.class);
		
		System.out.println(em3);
	}
}
