package com.te.collection;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		
		// priority queue is used to give more priority here by default it will be print small to big
		// but if we want to change then we can use Comparator.reverse
		Queue<Integer> a=new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		a.offer(4);
		a.offer(7);
		a.offer(8);
		a.offer(1);
		
		System.out.println(a);
		
		System.out.println(a.poll());
		
		System.out.println(a);
		
		
	}
}
