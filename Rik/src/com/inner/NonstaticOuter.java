package com.inner;

public class NonstaticOuter {

	private int a = 10;

	int b = 30;
	static int c = 25;

	class InnerDemo {

		public void displayShow() {

			//non static and static variable ,method can access in non static class
			System.out.println("sum " + (a + b + c));

		}

	}

	public static void main(String[] args) {
		// for create object of inner class first we need to create object of Outer class
		NonstaticOuter out=new NonstaticOuter();
		
		InnerDemo in=out.new InnerDemo();
		in.displayShow();

	}

}
