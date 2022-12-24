package com.te.java;


import java.nio.file.AccessDeniedException;

import javax.naming.InvalidNameException;

public  class Student {
	
	private String name;
	
	private int rollNumber;
	
	private String password;
	
	
	public String getName() {
		
	return	this.name;
		
	}
	
	public void setName(String name) throws InvalidNameException {
		
		String str=name.trim();
		if(str.isEmpty()) {
			
			throw new InvalidNameException("Name can not be empty");
		}
		this.name=name;
	}
	
	public int getRollNumber() {
		
		return this.rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		
		if(rollNumber<=0) {
			throw new IllegalArgumentException("Invalid roll Number and Rollnumber can not be zero ");
		}
		
		this.rollNumber=rollNumber;
		
	}
	
	public String getPassword() {
		
		if(password.equals(password))
			System.out.println("Login succesfully");
		return this.password;
	}
	
	public void setPassword(String password) throws AccessDeniedException {
		String pas=password.trim();
		if(pas.isEmpty()) {
			
			throw new AccessDeniedException(password);
			
		}else {
			System.out.println("password set successfully");
			this.password=password;
			
		}
		
		
	}
	
	public void display() {
		
		System.out.println("Name: "+this.name);
		System.out.println("RollNumber: "+this.rollNumber);
		System.out.println("password: "+this.password);
	}
	
	


}
