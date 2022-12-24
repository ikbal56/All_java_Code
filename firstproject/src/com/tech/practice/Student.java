package com.tech.practice;

public class Student {

	private String sName;
	private int roll;
	private double marks;
	public Student(String sName, int roll, double marks) {
		super();
		this.sName = sName;
		this.roll = roll;
		this.marks = marks;
	}
	public String getsName() {
		return sName;
	}
	public Integer getRoll() {
		return roll;
	}
	public double getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	
}
