package com.te.jspider;

public class LearnMethod {
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello friend");
	
		login();
		LearnMethod rik=new LearnMethod();
	   rik.signup();
		
		
	}

	public static void login(){
		
		System.out.println("Successfully login in static method");
		
	}
	
	public void signup() {
		System.out.println("Your Details added in our Database and this is non static method");
	}
}
