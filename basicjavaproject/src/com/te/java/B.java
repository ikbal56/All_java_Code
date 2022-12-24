package com.te.java;

public class B extends Main{

	B(int a) {
		// super and this should be first statement
		super();
		System.out.println("Hii.....");
		
	}
	
	public static void main(String[] args) {
		
		B b=new B(2);
		Main m=new Main(7,3);
		m.display();
	}

}
