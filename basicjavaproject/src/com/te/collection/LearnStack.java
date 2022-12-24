package com.te.collection;

import java.util.Stack;

public class LearnStack {
	
	
	public static void main(String[] args) {
		
		// stack last in first out
		Stack<String> st=new Stack<String>();
		
		st.push( "lion");
		st.push( "tiger");
		st.push( "horse");
		st.push( "cat");
		
		System.out.println(st);
	
		// it will be show last element
		//System.out.println(st.peek());
		
		// it will be give last element
		
		System.out.println(st.pop());
		
		System.out.println(st);
		
		//
	
	}

}
