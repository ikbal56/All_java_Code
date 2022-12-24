package com.techno.exception;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriority {

	public static void main(String[] args) {
		
		Queue pq= new PriorityQueue();
		pq.add(25);
		pq.add(20);
		pq.add(22);
		pq.add(23);
		pq.add(23);
		
		System.out.println(pq);
	}
}
