package com.te.healthdto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Patients {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private String mobile;
	private String city;
	private String password;
	
	@Autowired
	@ManyToMany
	private List<Doctors> doctor;

	public Patients(int patientId, String patientName, String mobile, String city, String password,
			List<Doctors> doctor) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobile = mobile;
		this.city = city;
		this.password = password;
		this.doctor = doctor;
	}

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Doctors> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctors> doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patients [patientId=" + patientId + ", patientName=" + patientName + ", mobile=" + mobile + ", city="
				+ city + ", password=" + password + ", doctor=" + doctor + "]";
	}

	

}
