package com.te.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;
@Repository
public class PatientRepoImp implements PatientRepo{

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD");
	boolean isInserted=false;
		@Override
		public boolean insert(Patient patient) {
	EntityManager manager=  factory.createEntityManager();
	manager.getTransaction().begin();
	manager.persist(patient);
	manager.getTransaction().commit();
	isInserted=true;
	return isInserted;
		}
		@Override
		public boolean check(int doctorId, String password) {
	EntityManager manager = factory.createEntityManager();
	Patient patient= manager.find(Patient.class, doctorId);
			if(patient.getPassword().equals(password)) {
				isInserted=true;
			}
			return isInserted;
		}
		@Override
		public Patient getById(int id,Doctor doctor) {
			EntityManager manager=  factory.createEntityManager();
			manager.getTransaction().begin();
 Patient patient=  manager.find(Patient.class, id);
 List<Doctor> doctorlist = new ArrayList<Doctor>();
 doctorlist.addAll(patient.getDoctor());
 doctorlist.add(doctor);
 patient.setDoctor(doctorlist);
 manager.persist(patient);
 manager.getTransaction().commit();
			return patient;
		}

}
