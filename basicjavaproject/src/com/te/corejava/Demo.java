package com.te.corejava;

public class Demo extends MethodOverridingDemo {
	
	void show() {
		super.show();
		System.out.println("Hlo world ");
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.show();
		
//		MethodOverridingDemo dm=new MethodOverridingDemo();
//		dm.show();
	}

}
