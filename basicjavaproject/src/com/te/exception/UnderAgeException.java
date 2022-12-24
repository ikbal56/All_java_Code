package com.te.exception;


//this is checked exception
public class UnderAgeException extends Exception{
	
	
	UnderAgeException(){
		
		super("You are under age ");
	}
	
	UnderAgeException(String message){
		
		super(message);
	}

}
