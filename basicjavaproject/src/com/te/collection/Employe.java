package com.te.collection;

import java.util.Comparator;
import java.util.Objects;

public class Employe implements Comparator<Employe> {
	
	String name;
	int empId;
	
	public Employe(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employe [name=" + name + ", empId=" + empId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return empId == other.empId;
	}

//	@Override
//	public int compareTo(Employe that) {
//		// TODO Auto-generated method stub
//		return this.empId-that.empId;
//	}

	
	@Override
	public int compare(Employe o1, Employe o2) {
		
		return 0;
	}

	
	
	

}
