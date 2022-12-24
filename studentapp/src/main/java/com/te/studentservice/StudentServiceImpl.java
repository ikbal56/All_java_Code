package com.te.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.studentdao.StudentDAO;
import com.te.studentdto.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO dao;
	
	@Override
	public boolean addStudent(Student student) {
		
		return dao.addStudent(student);
	}

}
