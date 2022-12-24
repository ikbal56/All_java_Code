package com.te.service;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;

public interface PatientServiceInter {
	public boolean insert(Patient paitent);
	public boolean check(int id,String password);
	public Patient getById(int id,Doctor doctor);
}
