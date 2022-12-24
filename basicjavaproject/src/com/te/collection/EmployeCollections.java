package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeCollections {
	
	public static void main(String[] args) {
		
		List<Employe> emp=new ArrayList<Employe>();
		
		emp.add(new Employe("Ikbal",101));
		emp.add(new Employe("Hossain",105));
		emp.add(new Employe("Arip",91));
		
		// using comparable but we have to implements comparable interface
		//Collections.sort(emp);
		
		// using comparator implements comparator interface 
		Collections.sort(emp,new Comparator<Employe>() {

			@Override
			public int compare(Employe o1, Employe o2) {
				
				return o1.name.compareTo(o2.name);
				
				
			}
			
			
		});
		
		System.out.println(emp);
	}

}
