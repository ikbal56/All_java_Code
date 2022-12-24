package dailyprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	static ArrayList<SweetShop> sweet = new ArrayList<SweetShop>();

	public static void main(String[] args) {
		
		SweetShop sw=new SweetShop("lancha",190.0,2);
		SweetShop sw2=new SweetShop("Rosmalai",172.0,3);
		SweetShop sw3=new SweetShop("Mehedana",175.2,1);
		
		sweet.add(sw);
		sweet.add(sw2);
		sweet.add(sw3);
		
		Collections.sort(sweet);
		for(SweetShop sh:sweet) {
			System.out.println(sh);
		}
		
	

		

	}

}
