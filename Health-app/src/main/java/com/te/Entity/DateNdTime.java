package com.te.Entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class DateNdTime {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ref;
	private String date;
	private String time;
	 @ManyToOne
	private Doctor doctor;
	 @ManyToOne
	 private Patient patient;
	public DateNdTime() {
		super();
	}
	

	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public DateNdTime(int ref, String date, String time, Doctor doctor, Patient patient) {
		super();
		this.ref = ref;
		this.date = date;
		this.time = time;
		this.doctor = doctor;
		this.patient = patient;
	}


	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor2) {
		this.doctor = doctor2;
	}


	@Override
	public String toString() {
		return "DateNdTime [ref=" + ref + ", date=" + date + ", time=" + time + ", doctor=" + doctor + ", patient="
				+ patient + "]";
	}

}
