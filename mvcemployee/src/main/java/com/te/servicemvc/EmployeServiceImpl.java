package com.te.servicemvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.daomvc.EmployeDAO;
import com.te.dtomvc.Employe;

@Service
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	private EmployeDAO dao;
	
	@Override
	public boolean addEmploye(Employe emp) {
		
		return dao.addEmploye(emp);
	}

	@Override
	public Employe getEmployee(int empId, String password) {
		
		return dao.getEmployee(empId, password);
	}

	@Override
	public boolean deleteEmp(int empId, String password) {
		
		return dao.deleteEmp(empId, password);
	}

	@Override
	public boolean updateEmp(Employe emp) {
		
		return dao.updateEmp(emp);
	}

}
