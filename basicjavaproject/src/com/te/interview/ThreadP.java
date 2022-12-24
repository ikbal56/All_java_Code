package com.te.interview;

public class ThreadP {

	public static void main(String[] args) {

		Runnable rm = () -> {

			for (int i = 1; i <= 11; i++) {

				System.out.println("Ikbal");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};

		Thread t = new Thread(rm);

		t.start();
		
		Runnable rm2=()->{
			
			for(int i=1;i<=11;i++) {
				System.out.println("Ruksar");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};

		Thread t2=new Thread(rm2);
		t2.start();
		
	}

}
