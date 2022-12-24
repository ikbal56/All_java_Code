package com.te.exception;

public class VotingApp {
	
	public static void main(String[] args) {
		
		int age=7;
		
		try {
		if(age<18) {
			
			throw new UnderAgeException("You can not vote because you are age below 18");
		}else {
			
			System.out.println("You can vote");
		}
		
		}catch(UnderAgeException e) {
			
			e.printStackTrace();
		}
	}

}
