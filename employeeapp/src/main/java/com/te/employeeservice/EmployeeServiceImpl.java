package com.te.employeeservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.employeedao.EmployeeDAO;
import com.te.employeedto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;

	@Override
	public boolean addEmployee(Employee employee) {
		
		return dao.addEmployee(employee);
	}
	

	

}
