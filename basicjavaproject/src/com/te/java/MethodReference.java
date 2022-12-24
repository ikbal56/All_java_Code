package com.te.java;

public class MethodReference {
	
	public static void saySomething() {
		
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
		Thread t=new Thread(MethodReference::saySomething);
		t.start();
		
		
		
	}
}
