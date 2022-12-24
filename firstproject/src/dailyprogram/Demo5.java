package dailyprogram;

public class Demo5 extends Thread {

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Hello hl=new Hello();
		
//		mt.start();
//		hl.start();
//		
		mt.run();
		hl.run();
	}
}
