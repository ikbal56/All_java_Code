package com.technoelevate.exception;

public class UnderAgeException extends Exception {
	
	public UnderAgeException(){
		
		super("You are under Age");
		
	}
	
	public UnderAgeException(String message) {
		super(message);
	}

}



