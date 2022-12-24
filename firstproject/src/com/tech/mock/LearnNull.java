package com.tech.mock;

public class LearnNull {
	
	static String name;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(name.length());
		}catch(Exception e){
			System.out.println("We can not find string value");
			e.printStackTrace();
		}
	}
	

}
