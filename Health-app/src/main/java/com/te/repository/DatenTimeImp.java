package com.te.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.Entity.DateNdTime;
import com.te.Entity.Doctor;
import com.te.Entity.Patient;

@Repository
public class DatenTimeImp implements DatenTimeinter {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD");
	boolean isInserted = false;
	
	@Override
	public boolean insertDate(String date, String time, Doctor doctor) {
		DateNdTime date1 = new DateNdTime();
		EntityManager manager = factory.createEntityManager();
		date1.setDate(date);
		date1.setTime(time);
		date1.setDoctor(doctor);
		manager.getTransaction().begin();
		manager.persist(date1);
		manager.getTransaction().commit();
		isInserted = true;
		return isInserted;
	}

	@Override
	public boolean insertpatientdate(String date, String time, Patient patient) {
		DateNdTime date1 = new DateNdTime();
		EntityManager manager = factory.createEntityManager();
		date1.setDate(date);
		date1.setTime(time);
		
		
		date1.setPatient(patient);
		return false;
	}

	
	
}
