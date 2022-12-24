package com.te.healthservice;

import com.te.healthdto.Doctors;
import com.te.healthdto.Patients;

public interface HealthService {
	
	public boolean insertDetails(Doctors doctor);
	
	public boolean insertPatient(Patients patient);
	
	public boolean getDoctor(int doctorId,String password);
	
	public boolean getPatient(int patientId,String password );

}
