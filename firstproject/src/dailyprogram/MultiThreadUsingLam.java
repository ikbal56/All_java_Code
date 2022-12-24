package dailyprogram;

public class MultiThreadUsingLam {
	
	public static void main(String[] args) {
		
		
		new Thread(()->{
			for(int i=0;i<=3;i++) {
				System.out.println("Hii");
				
			}
		}).start();
		new Thread(()->{
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
			}
		}).start();
		
		System.out.println("main Thread");
	}

}
