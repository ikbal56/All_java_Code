package dailyprogram;

import java.util.ArrayList;
import java.util.HashSet;

public class Ikbal12 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ali=new ArrayList();
		
		ali.add(25);
		ali.add(25);
		ali.add(25);
		ali.add(26);
		ali.add(25);
		
		HashSet<Integer> hs=new HashSet(ali);
		
		hs.addAll(hs);
		System.out.println(hs);
	}
}
