package com.technoelevate.collections;

import java.util.Collections;
import java.util.Iterator;

public class Main {
    
	static ArrayImp ai=new ArrayImp(5);
	public static void main(String[] args) {
		ai.addElements("iku");
		ai.addElements("iku");
		ai.addElements("Hossain");
		ai.addElements("iku");
		ai.addElements("iku");
		ai.addElements("iku");
		ai.addElements("iku");
		
		
		//System.out.println(ai.getElements(2));
		
		//Collections.sort();
		
		//ai.getAllElements();
		//System.out.println(ai.size());

		Iterator itr=ai.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
