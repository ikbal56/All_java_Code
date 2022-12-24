package com.te.lambda;

public class ThreadUsingLambda {
	
	public static void main(String[] args) {
		
		
		Runnable rm=()->{
			
			for(int i=1;i<=10;i++) {
				
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
		Thread t=new Thread(rm);
		t.setName("iku");
		System.out.println(t.getName());
		t.start();
		
		
		Runnable r=()->{
			
			try {
				for(int i=1;i<=10;i++) {
					System.out.println("Hii");
					Thread.sleep(1000);
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		};
		
		Thread t2=new Thread(r);
		t2.start();
	}

}
