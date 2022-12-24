package dailyprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ikbal6 {

	public static void main(String[] args) {
		
	
		ArrayList<Integer> al=new ArrayList();
		
		al.add(251);
		al.add(252);
		al.add(225);
		al.add(25);
		al.add(250);
		
//		System.out.println(al);
		
//		al.remove(1);
//		System.out.println(al);
		
		ArrayList<Integer> als=new ArrayList(al);
		als.add(12);
		als.add(123);
		als.add(122);
		als.add(1);
		
		Collections.copy(als, al);
		System.out.println(als);
		
		System.out.println(Collections.max(als));
		System.out.println(Collections.min(als));
		Collections.sort(als);
		System.out.println(als);
	 Collections.reverse(als);

	 System.out.println(als);
	 
	 for(Integer element:als) {
		 System.out.println(element);
		 
		 Iterator<Integer> itr=als.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	 }
	}
}
