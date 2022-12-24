  package com.te.healthservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.healthdao.HealthDAO;
import com.te.healthdto.Doctors;
import com.te.healthdto.Patients;

@Service
public class HealthServiceImpl implements HealthService{

	@Autowired
	private HealthDAO dao;
	@Override
	public boolean insertDetails(Doctors doctor) {
		
		return dao.insertDetails(doctor);
	}
	@Override
	public boolean insertPatient(Patients patient) {
		
		return dao.insertPatient(patient);
	}
	@Override
	public boolean getDoctor(int doctorId, String password) {
		
		return dao.getDoctor(doctorId, password);
	}
	@Override
	public boolean getPatient(int patientId, String password) {
		
		return dao.getPatient(patientId, password);
	}

	
	

}
