package com.te.springcorestereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hos")
public class Hostel {
	
	@Value("Rajjak")
	private String name;
	
	@Value("Kolkata")
	private String city;
	public Hostel(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Hostel [name=" + name + ", city=" + city + "]";
	}
	

}
