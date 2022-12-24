package com.technoelevate.basic;
import java.util.ArrayList;
import java.util.Collections;

public class Customer {
	
	private static ArrayList<Vegetable> lt=new ArrayList<Vegetable>();
	
	public static void main(String[] args) {
		Vegetable vg=new Vegetable("Carrot",120.0,2);
		Vegetable vg2=new Vegetable("Potato",80.0,3);
		Vegetable vg3=new Vegetable("Been",60.0,4);
		
		lt.add(vg);
		lt.add(vg2);
		lt.add(vg3);
		
		Collections.sort(lt);
		for(Vegetable ve:lt) {
			System.out.println(ve);
		}
		
	}

}
