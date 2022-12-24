package dailyprogram;

//checked exception
public class UnderAgeException extends Exception {
	

	@Override
	public String toString() {
		return "UnderAgeException. you can not vote your age is below 18";
		}
	
}

