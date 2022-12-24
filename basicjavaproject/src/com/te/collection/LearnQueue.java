package com.te.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
	
	public static void main(String[] args) {
		// first in first out
		Queue<Integer> q=new LinkedList<Integer>();
		
		q.offer(3);
		q.offer(5);
		q.offer(6);
		q.offer(99);
		
		System.out.println(q);
		
		//it will be print first element which we have add
		System.out.println(q.poll());
		
		// what is the next element
		
		System.out.println(q.peek());
	}

}
