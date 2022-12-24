package com.te.studentdto;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentResponse {
	
	private int code;
	private String status;
	private String desc;
	
	@Autowired
	private Student student;


	public StudentResponse(int code, String status, String desc, Student student) {
		super();
		this.code = code;
		this.status = status;
		this.desc = desc;
		this.student = student;
	}


	public StudentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "StudentResponse [code=" + code + ", status=" + status + ", desc=" + desc + ", student=" + student + "]";
	}
	
	

}
