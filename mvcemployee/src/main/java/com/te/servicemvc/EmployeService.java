package com.te.servicemvc;

import com.te.dtomvc.Employe;

public interface EmployeService {

	
	public boolean addEmploye(Employe emp);
	public Employe getEmployee(int empId, String password);
	
	public boolean deleteEmp(int empId, String password);
	
	public boolean updateEmp(Employe emp);
}
