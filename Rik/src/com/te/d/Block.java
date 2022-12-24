package com.te.d;

public class Block {
	
	 int  eid;
	 {
		eid=11;
		//System.out.println(eid);
	}

	 public  void practice() {
		 System.out.println(eid);
	 }
	 
	 public static void main(String[] args) {
		
	  new Block().practice();
	}
}
