package com.te.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Doctor_details")
public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="Doctor_id")
private int doctorId;
@Column(name="Doctor_name")
private String doctorName;
@Column(name="Doctor_contact")
	private String doctorContact;
@Column(name="Doctor_specification")
	private String doctorSpecification;
@Column(name="password")
private String password;
@ManyToMany
private List<Patient> Patient;
@OneToMany
private List<DateNdTime> date;


public Doctor(int doctorId, String doctorName, String doctorContact, String doctorSpecification, String password,
		List<com.te.Entity.Patient> patient, List<DateNdTime> date) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.doctorContact = doctorContact;
	this.doctorSpecification = doctorSpecification;
	this.password = password;
	Patient = patient;
	this.date = date;
}
public Doctor() {
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
public String getDoctorContact() {
	return doctorContact;
}
public void setDoctorContact(String doctorContact) {
	this.doctorContact = doctorContact;
}
public String getDoctorSpecification() {
	return doctorSpecification;
}
public void setDoctorSpecification(String doctorSpecification) {
	this.doctorSpecification = doctorSpecification;
}
public List<Patient> getPatient() {
	return Patient;
}
public void setPatient(List<Patient> patient) {
	Patient = patient;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorContact=" + doctorContact
			+ ", doctorSpecification=" + doctorSpecification + ", password=" + password + ", Patient=" + Patient
			+ ", date=" + date + "]";
}
public List<DateNdTime> getDate() {
	return date;
}
public void setDate(List<DateNdTime> date) {
	this.date = date;
}
 
}
