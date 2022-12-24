package com.technoelevate.p;

import java.util.ArrayList;
import java.util.Collections;

public class Counter {

	static ArrayList<SweetShop> sh=new ArrayList<SweetShop>();
	
	public static void main(String[] args) {
		
		SweetShop sp=new SweetShop("Mouchak",450,3);
		SweetShop sp2=new SweetShop("Rosmalai",252,1);
		SweetShop sp3=new SweetShop("Lancha",325,2);
		
		sh.add(sp);
		sh.add(sp2);
		sh.add(sp3);
		
		System.out.println("Before shorting");
		System.out.println(sh);
		
		
		Collections.sort(sh,new MyComparator());
		for(SweetShop obj:sh) {
			System.out.println(obj);
		}
		
	}
}
