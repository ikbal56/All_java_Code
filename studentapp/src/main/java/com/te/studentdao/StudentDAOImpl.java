package com.te.studentdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

import com.te.studentdto.Student;

public class StudentDAOImpl implements StudentDAO {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("Iku ");
	
	@Override
	public boolean addStudent(Student student) {
		
		boolean isInserted=false;
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		try {
			
			transaction.begin();
			manager.persist(student);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			
		}
		return isInserted;
	}

	
}
