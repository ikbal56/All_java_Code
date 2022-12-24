package com.te.lambda;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		// anonymous class
//		MyInter m=new MyInter() {
//
//			@Override
//			public void hello() {
//				
//				System.out.println("This is Ikbal");
//				
//			}
//			
//		};
		
		//m.hello();
		
		
		// using lambda expression
		
		MyInter i=()->{
			
			System.out.println("First time I am using lambda expression");
		};
		
		i.hello();
		
		
		SumInter sum=(int a,int b)->{
			
			return a+b;
			
		};
		
		System.out.println(sum.sumValue(5, 6));
		
		
		LengthOfString l=(str)->{
			
			return str.length();
		};
		
		System.out.println(l.len("Ruksar"));
	}

}
