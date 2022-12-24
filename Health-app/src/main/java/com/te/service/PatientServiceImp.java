package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;
import com.te.repository.PatientRepo;
@Service
public class PatientServiceImp implements PatientServiceInter{
@Autowired
	private PatientRepo repo; 		
	
	
	@Override
	public boolean insert(Patient doctor) {
		return repo.insert(doctor);
	}
	@Override
	public boolean check(int doctorId, String password) {
		return repo.check(doctorId, password);
	}
	@Override
	public Patient getById(int id,Doctor doctor) {
		return repo.getById( id,doctor);
	}

}
