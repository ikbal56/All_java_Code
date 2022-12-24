package dailyprogram;

public class Counter {

	public static void main(String[] args) {
		
		Store s=Vegetable::new;
		
		s.order("potato", 2, 50).payment();
		
		
	}
}
