package com.te.java;

public class Main {

	int a = 10;
	int b = 4;
	
	
	Main(int a,int b){
		
		this.a=7;
		this.b=5;
		System.out.println(a+b);
	}
	
	Main(){
		System.out.println( "No argument constructor");
	}
	
	void display() {
		
		System.out.println("this is display method");
	}

}
