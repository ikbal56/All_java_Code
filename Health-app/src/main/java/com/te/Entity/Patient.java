package com.te.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="patient_details")
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int patientId;
@Column(name="patient_name")
	private String patientName;
@Column(name="patient_contact")
	private String patientContact;
@Column(name="password")
private String password;
@ManyToMany
	private List<Doctor> doctor;
@ManyToMany
private List<DateNdTime> datetime;
public Patient() {
	super();
}


public List<DateNdTime> getDatetime() {
	return datetime;
}


public void setDatetime(List<DateNdTime> datetime) {
	this.datetime = datetime;
}


public Patient(int patientId, String patientName, String patientContact, String password, List<Doctor> doctor,
		List<DateNdTime> datetime) {
	super();
	this.patientId = patientId;
	this.patientName = patientName;
	this.patientContact = patientContact;
	this.password = password;
	this.doctor = doctor;
	this.datetime = datetime;
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
public String getPatientContact() {
	return patientContact;
}
public void setPatientContact(String patientContact) {
	this.patientContact = patientContact;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<Doctor> getDoctor() {
	return doctor;
}
public void setDoctor(List<Doctor> doctor) {
	this.doctor = doctor;
}
@Override
public String toString() {
	return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientContact=" + patientContact
			+ ", password=" + password + ", doctor=" + doctor + "]";
}

}