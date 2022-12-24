package com.technoelevate.p;

import java.util.ArrayList;
import java.util.Collections;

public class Customer {

	static ArrayList<Vegetable> veg=new ArrayList<Vegetable>();
	
	public static void main(String[] args) {
		
		Vegetable v1=new Vegetable("Carrot",80,2);
		Vegetable v2=new Vegetable("Aotato",145,5);
	    Vegetable v3=new Vegetable("Tomato",62,3);
	    
	    veg.add(v1);
	    veg.add(v2);
	    veg.add(v3);
		
	    Collections.sort(veg);
	    
	    for(Vegetable ve:veg) {
	    	System.out.println(ve);
	    }
		
	}
	
}
