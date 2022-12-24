package com.te.collection;

import java.util.Objects;

public class Student {
	
	String name;
	
	int rollNumber;
	
	public Student(String name,int rollNumber) {
		
		this.name=name;
		this.rollNumber=rollNumber;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}

	//duplicate RollNumber will not add
	@Override
	public int hashCode() {
		return Objects.hash(rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNumber == other.rollNumber;
	}

	
	

}
