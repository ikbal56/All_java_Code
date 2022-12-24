package com.te.daomvc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.dtomvc.Employe;

@Repository
public class EmployeDAOImpl implements EmployeDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("employe");

	@Override
	public boolean addEmploye(Employe emp) {

		boolean flag = false;

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {

			transaction.begin();

			manager.persist(emp);

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
	public Employe getEmployee(int empId, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		Employe emp = manager.find(Employe.class, empId);
		if (emp.getPassword().equals(password)) {
			Employe myemp = emp;

			return myemp;
		}
		return null;

	}

	@Override
	public boolean deleteEmp(int empId, String password) {

		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Employe emp = manager.find(Employe.class, empId);
			if (emp.getPassword().equals(password)) {
				manager.remove(emp);
				transaction.commit();
				flag = true;
			}
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateEmp(Employe emp) {

		boolean flag = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Employe myemp = manager.find(Employe.class, emp.getEmpId());
			if (emp.getFirstName() != null && emp.getFirstName() != "") {
				myemp.setFirstName(emp.getFirstName());
			}
			if (emp.getLastName() != null && emp.getLastName() != "") {
				myemp.setLastName(emp.getLastName());
			}
			if (emp.getContactNumber() != null && emp.getContactNumber() != "") {
				myemp.setContactNumber(emp.getContactNumber());
			}
			transaction.commit();
			flag = true;

		} catch (Exception e) {
			transaction.rollback();
			manager.close();
			e.printStackTrace();
		}
		return flag;
	}

}
