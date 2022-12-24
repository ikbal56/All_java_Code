package com.techno.exception;

public class MultiThread {

	public static void main(String[] args) {
		
		new Thread(()->{ 
			for(int i=0;i<5;i++) {
				System.out.println("Hii");
			}
		}).start();
		
		new Thread(()->{
			for(int i=0;i<3;i++) {
				System.out.println("Hello");
			}
		}).start();
		
		System.out.println("Main thread");
	}
	
	
}
