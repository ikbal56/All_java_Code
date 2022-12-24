package com.te.encapsulation;

import javax.management.InvalidAttributeValueException;

public class EmployeeMain {
	
	public static void main(String[] args) throws InvalidAttributeValueException {
		
		
		Employee emp=new Employee("Rik",131 ,"1263535753", "Hyderabad");
		Employee emp2=new Employee("Masud",111 ,"12635357", "Kolkata");
		
				
		//System.out.println(emp2.getEmployeName());
		
		emp.setEmployeName( "Rik Berhampore" );
		
		System.out.println(emp.getEmployeName());
		
//		emp.setEmpId(0);
//		
//		
//		System.out.println(emp.getEmpId());

		
	}

}
