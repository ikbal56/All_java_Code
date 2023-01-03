package com.te.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.emp.dto.Emp;
import com.te.emp.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpRepo repo;
	
	@Override
	public Emp insertDetails(Emp emp) {
		
		return repo.save(emp);
	}

}
