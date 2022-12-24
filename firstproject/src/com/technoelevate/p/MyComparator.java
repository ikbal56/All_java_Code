package com.technoelevate.p;

import java.util.Comparator;

public class MyComparator implements Comparator<SweetShop> {

	@Override
	public int compare(SweetShop o1, SweetShop o2) {
		
		//Descending
	//	return o2.getPrice().compareTo(o1.getPrice());
		//Ascending
//		return o1.getPrice().compareTo(o2.getPrice());
		
		return o1.getName().compareTo(o2.getName());
		
		
	}

	
}
