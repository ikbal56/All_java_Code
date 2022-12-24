package com.tech.mock;

public class Votter {

public static void main(String[] args) {
	
	int age=17;
	try {
		if(age<18) {
			throw new AgeException();
		}else {
			System.out.println("You can vote");
		}
	}catch(AgeException e) {
		e.printStackTrace();
	}
	
}	
}
