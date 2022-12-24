package com.te.thread;

public class BookingApplication extends Thread{
	
	static BookSeat b;
	int seats;
	
	public void run() {
	
		b.ticketBooked(seats);
		
	}
	
	public static void main(String[] args) {
	    b=new BookSeat();
		BookingApplication iku=new BookingApplication();
		
		iku.seats=5;
		iku.start();
		
		
		BookingApplication ruku=new BookingApplication();
		
		ruku.seats=8;
		ruku.start();
	}

}
