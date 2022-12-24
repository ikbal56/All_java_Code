package com.technoelevate.java8features;

public class Counter {

	public static void main(String[] args) {
		
		//constructor reference
		Store s=Vegetable::new;
		
		s.order("brnjal", 2, 50).payment();
	}
	
}
