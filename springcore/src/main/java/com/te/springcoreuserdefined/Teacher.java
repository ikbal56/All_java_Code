package com.te.springcoreuserdefined;

public class Teacher {

	private String name;
	private Students student;

	public Teacher(String name, Students student) {
		super();
		this.name = name;
		this.student = student;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Students getStudent() {
		return student;
	}

	public void setStudent(Students student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", student=" + student + "]";
	}

}
