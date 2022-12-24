package com.te.springconstructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/te/springconstructorinj/configconstructor.xml");
		Person ps=context.getBean("person",Person.class);
		System.out.println(ps);
		
	}

}
