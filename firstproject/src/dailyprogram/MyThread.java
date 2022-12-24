package dailyprogram;

public class MyThread extends Thread {
	
	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("Hii from child thread");
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}

}

class Hello extends Thread {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(" second Thread");
			
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

}


