package com.te.employeedao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.employeedto.Employee;





@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("employeedetails");

	@Override
	public boolean addEmployee(Employee employee) {
		
		boolean isInserted=false;
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		try {
			
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			
		}
		
		return isInserted;
	}

	
	

	
   
	
	
	
	

}
