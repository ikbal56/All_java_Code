package com.te.emp.dto;

public class EmpResponse {

	private int statusCode;
	private String message;
	private String desc;

	private Emp emp;

	public EmpResponse(int statusCode, String message, String desc, Emp emp) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.desc = desc;
		this.emp = emp;
	}

	public EmpResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "EmpResponse [statusCode=" + statusCode + ", message=" + message + ", desc=" + desc + ", emp=" + emp
				+ "]";
	}

}
