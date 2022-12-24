package com.te.thread;

public class BookSeat {
	
	int total_seat=15;
	
	synchronized void ticketBooked(int seat) {
		
		//System.out.println(Thread.currentThread().getName());
		if(total_seat>=seat) {
			
			System.out.println("Ticket Booked Successfully:"+seat);
			total_seat=total_seat-seat;
			
			System.out.println("Remaining Seat:"+total_seat);
		}else {
			
			System.out.println("Sorry your Ticket not booked");
			System.out.println("Because Remaining seat:"+total_seat);
		}
	}
}
