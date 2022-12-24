package com.te.daomvc;

import com.te.dtomvc.Employe;

public interface EmployeDAO {
	
	public boolean addEmploye(Employe emp);
	
	public Employe getEmployee(int empId, String password);
	
	public boolean deleteEmp(int empId, String password);
	
	public boolean updateEmp(Employe emp);


}
