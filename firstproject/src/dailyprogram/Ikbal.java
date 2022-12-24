package dailyprogram;

import java.util.Iterator;

public class Ikbal {

	
	public static void main(String[] args) {
		
		
		ArrayImplements ai=new ArrayImplements(5);
		
		ai.addElements(25);
		ai.addElements(25);
		ai.addElements(25);
		ai.addElements("iku");
		ai.addElements("Arip");
		ai.addElements(25);
		
		
		
		
		Iterator itr=ai.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
