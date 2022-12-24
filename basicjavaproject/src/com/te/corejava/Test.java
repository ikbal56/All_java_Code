package com.te.corejava;

public class Test {
	
	void m1() {
		
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}

	void m1(int x,int y) {
		
		int c;
		c=x+y;
		System.out.println(c);
	}
	
	void m1(int x,double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		
		t.m1();
		t.m1(15, 15);
		t.m1(4, 5.6);
	}
}
