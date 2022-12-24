package dailyprogram;

public class Votting {

	public static void main(String[] args) {
		int age=14;
		try {
		if(age<18) {
			throw new AgeException();
		}else {
			System.out.println("You can vote");
		}
	}
	catch(AgeException e) {
		e.printStackTrace();
		
	}
	
}
}
