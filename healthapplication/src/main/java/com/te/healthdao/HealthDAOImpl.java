package com.te.healthdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.healthdto.Doctors;
import com.te.healthdto.Patients;

@Repository
public class HealthDAOImpl implements HealthDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("health");

	@Override
	public boolean insertDetails(Doctors doctor) {

		boolean flag = false;

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {

			transaction.begin();
			manager.persist(doctor);
			transaction.commit();
			flag = true;
		} catch (Exception e) {

			transaction.rollback();
			manager.close();
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean insertPatient(Patients patient) {

		boolean flag = false;

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {

			transaction.begin();
			manager.persist(patient);
			transaction.commit();
			flag = true;

		} catch (Exception e) {
			transaction.rollback();
			manager.close();
			e.printStackTrace();

		}

		return flag;
	}

	@Override
	public boolean getDoctor(int doctorId, String password) {
		

		boolean flag = false;

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {

			transaction.begin();
			Doctors doctor=manager.find(Doctors.class,doctorId);
			
			if (doctor.getPassword().equals(password)) {
				flag = true;
				
			}


		} catch (Exception e) {
			transaction.rollback();
			manager.close();
			e.printStackTrace();

		}

		return flag;
		
		
	}

	@Override
	public boolean getPatient(int patientId, String password) {
		boolean flag=false;
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		try {
			
			transaction.begin();
			Patients patient=manager.find(Patients.class,patientId);
			if(patient.getPassword().equals(password)) {
				flag=true;
			}
			
		} catch (Exception e) {
			
			transaction.rollback();
			manager.close();
			e.printStackTrace();
		}
		
		
		return flag;
	}

}
