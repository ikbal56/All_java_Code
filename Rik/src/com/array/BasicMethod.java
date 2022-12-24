package com.array;

public class BasicMethod {
	
	public BasicMethod m1() {
		BasicMethod bm=new BasicMethod();
		System.out.println("This is M1 method");
		return bm;
	}
	
	public BasicMethod m2() {
		BasicMethod bm=new BasicMethod();
		System.out.println("This is M2 method");
		return this;
	}

	public BasicMethod m3() {
		BasicMethod bm=new BasicMethod();
		System.out.println("This is M3 method");
		return this;
	}
	
	public char hii() {
		System.out.println("Hlo Dear");
		
		return  'a';
	}

	public float hlo() {
		System.out.println("Hlo Iku");
		
		return  2;
	}
	
	public int m4(int a,int b) {
		System.out.println("hii Ruku");
		
		return  (a+b);
	}
	public static void main(String[] args) {
		BasicMethod bm=new BasicMethod();
		BasicMethod b1=bm.m1();
		BasicMethod b2=bm.m2();
		BasicMethod b3=bm.m3();
		char b=bm.hii();
		bm.hlo();
		int m=bm.m4(5, 6);
		System.out.println(m);
		
		
	}
}
