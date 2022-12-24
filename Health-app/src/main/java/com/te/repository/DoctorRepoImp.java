package com.te.repository;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.te.Entity.Doctor;
@Repository
public class DoctorRepoImp implements DoctorRepo{
EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD");
boolean isInserted=false;
	@Override
	public boolean insert(Doctor doctor) {
EntityManager manager=  factory.createEntityManager();
manager.getTransaction().begin();
manager.persist(doctor);
manager.getTransaction().commit();
isInserted=true;
return isInserted;
	}
	@Override
	public boolean check(int id, String password) {
EntityManager manager = factory.createEntityManager();
manager.getTransaction().begin();
Doctor doctor= manager.find(Doctor.class, id);
		if(id==doctor.getDoctorId()&&password==doctor.getPassword()) {
			isInserted=true;
		}
		return isInserted;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> getAllDoctor() {
		EntityManager manager = factory.createEntityManager();
		ArrayList<Doctor> doc=new ArrayList<Doctor>();
		try {
			Query query=manager.createQuery("from Doctor");
			             doc =   (ArrayList<Doctor>)query.getResultList();		
		} catch (Exception e) {
			manager.getTransaction().rollback();
			e.printStackTrace();
		}
		return doc;
	}
	@Override
	public Doctor getById(int id) {
		EntityManager manager=  factory.createEntityManager();
		manager.getTransaction().begin();
 Doctor doctor=  manager.find(Doctor.class, id);
manager.getTransaction().commit();
isInserted=true;
		return doctor;
	}
}
