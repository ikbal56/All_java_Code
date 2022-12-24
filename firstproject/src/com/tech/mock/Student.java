package com.tech.mock;

public class Student implements Comparable<Student> {
	private String name;
	private int roll;
	private double marks;
	public Student(String name, int roll, double marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public Integer getRoll() {
		return roll;
	}
	public double getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return getName().compareTo(o.getName());
	}
	
	

}
