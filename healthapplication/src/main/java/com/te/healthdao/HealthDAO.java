package com.te.healthdao;

import com.te.healthdto.Doctors;
import com.te.healthdto.Patients;

public interface HealthDAO {
	

	public boolean insertDetails(Doctors doctor);
	public boolean insertPatient(Patients patient);
	
	public boolean getDoctor(int doctorId,String password);
	public boolean getPatient(int patientId,String password );

}
