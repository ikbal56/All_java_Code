package com.technoelevate.exception;

public class AgeException extends RuntimeException {
	
	
	public AgeException() {
		super("You can not vote");
	}
	
	public AgeException(String message) {
		super("message");
	}

}
