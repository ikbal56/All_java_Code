package com.te.employeedto;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeResponse {

	private int statusCode;
	private String status;
	private String desc;

	@Autowired
	private Employee employee;

	public EmployeeResponse(int statusCode, String status, String desc, Employee employee) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.desc = desc;
		this.employee = employee;
	}

	public EmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeResponse [statusCode=" + statusCode + ", status=" + status + ", desc=" + desc + ", employee="
				+ employee + "]";
	}

}
