package com.te.d;

public class TestBlock {

	public TestBlock(){
		
		this(11);
		
		System.out.println("0 argument constractor");
		
	}
	
  public TestBlock(int a){
	  this(11,3);
		System.out.println("1 argument constractor");
		
	}
	
  
  public TestBlock(int a,int b){
	  
		System.out.println("2 argument constractor");
		
	}
  
  public static void m1() {
	  
	  System.out.println("this is static method");
  }
  
  {
	  System.out.println("this is instance block");
  }
  
  static {
	  System.out.println("This is  static block");
  }
  
  public static void main(String[] args) {
	System.out.println("This is main method");
	new TestBlock();
	new TestBlock();
}
}
