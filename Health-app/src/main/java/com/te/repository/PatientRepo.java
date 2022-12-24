package com.te.repository;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;

public interface PatientRepo {
	public boolean insert(Patient patient);
	public boolean check(int id,String password);
	public Patient getById(int id,Doctor doctor);
}
