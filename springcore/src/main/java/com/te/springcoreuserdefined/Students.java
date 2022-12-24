package com.te.springcoreuserdefined;

public class Students {
	
	private String name;
	private String subject;
	public Students(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	public Students() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", subject=" + subject + "]";
	}
	
	

}
