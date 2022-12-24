package com.te.encapsulation;

import javax.management.InvalidAttributeValueException;

public class Employee {

	private String employeName;

	private int empId;

	private String mob;

	private String city;

	public Employee(String employeName, int empId, String mob, String city) {

		this.employeName = employeName;
		this.empId = empId;
		this.mob = mob;
		this.city = city;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		
		
		this.employeName = employeName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) throws InvalidAttributeValueException {
		
		
		if(empId>0) {
			
			this.empId = empId;
		}else {
			
			throw new InvalidAttributeValueException( "Employee id can not be less than 1");
		}
		
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

}
