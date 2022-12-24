package com.te.springcorebeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainShop {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/springcorebeanscope/beanscope.xml");
		MarwadiShop shop=context.getBean("marwadi",MarwadiShop.class);
		System.out.println(shop.hashCode());
		
		MarwadiShop shop1=context.getBean("marwadi",MarwadiShop.class);
		System.out.println(shop1.hashCode());
		
		//System.out.println(shop);
	}

}
