package dailyprogram;

import com.technoelevate.exception.AgeException;

public class Voter {

	public static void main(String[] args) {
		
		int age=17;
		
		try {
			
			if(age<18) {
				
				throw new UnderAgeException();
				
			}else {
				System.out.println("you can vote now");
			}
		}
		catch(UnderAgeException e){
			e.printStackTrace();
			
		}

	}
}
