package com.te.healthdto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
public class Doctors {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorId;
	private String doctorName;
	private String specialists;
	private String mobile;
	private String email;
	private String password;
	
	@Autowired
	@ManyToMany
	private List<Patients> patient;

	public Doctors(int doctorId, String doctorName, String specialists, String mobile, String email, String password) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialists = specialists;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialists() {
		return specialists;
	}

	public void setSpecialists(String specialists) {
		this.specialists = specialists;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Doctors [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialists=" + specialists
				+ ", mobile=" + mobile + ", email=" + email + ", password=" + password + "]";
	}

}
