package com.inner;



public class Outer {

	int a = 5;
	static int b = 10;
	int c = 10;

	static class Inner {

		public void getShow() {

			// non static variable and method can not access in static class
			System.out.println(b);
		}

		// if we have main method in inner class then directly we can create object of
		// Inner class
		Inner() {

			System.out.println("this is Inner class construtor");
		}

		public static void main(String[] args) {
			Inner in = new Inner();

		}

	}

	public void check() {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		// no need to create object of Outer class
		Outer.Inner oi = new Outer.Inner();
		oi.getShow();
		// Inner.getShow();

		new Outer().check();
	}

}
