package com.technoelevate.ploymorphism;

public class Child extends Parent{
	
	void marry() {// Overriding
		System.out.println("White girl");
	}
	
	public static void main(String[] args) {
		Child ch=new Child();
		ch.marry();
	}

}
