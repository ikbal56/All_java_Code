package com.technoelevate.ploymorphism;

public class OverLoading {
	
	
  public void m1(int a) {
	  System.out.println("one argument method ");
  }

  public void m1(int a, int b) {
	  
	  System.out.println("two argument method");
  }
  
  public void m1(char ch) {
	  System.out.println("this is same argument");
  }
  public void m1(String s) {
	  
	  System.out.println("this is also same argument");
  }
  public static void main(String[] args) {
	OverLoading ol=new OverLoading();
	
	ol.m1(11);
	ol.m1(6, 5);
	ol.m1('R');
	ol.m1("iku");
	
}
}
