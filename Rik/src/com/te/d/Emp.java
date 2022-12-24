package com.te.d;

public class Emp implements Company {

	String name;
	String city;
	
	
	@Override
	public void setdetails(String companyname, String city) {
		
	this.name=companyname;
	this.city=city;
		
		
	}

	@Override
	public void showdetails() {
		
		System.out.println(name);
		System.out.println(city);
		
	}
	
	

	

}
