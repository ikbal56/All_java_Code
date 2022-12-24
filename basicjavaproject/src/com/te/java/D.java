package com.te.java;

import java.util.ArrayList;

public class D  {
	
	
	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList<>();
		
		arr.add(1);
		arr.add("iku");
		
		
		for(Object obj:arr) {
			
			System.out.println(obj);
		}
		
	}

}
