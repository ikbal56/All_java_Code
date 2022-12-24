package com.te.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.Entity.Doctor;
import com.te.repository.DoctorRepo;
@Service
public class DoctorServiceImp implements DoctorService {
@Autowired
	private DoctorRepo repo;
	@Override
	public boolean insert(Doctor doctor) {
		return repo.insert(doctor);
	}
	@Override
	public boolean check(int id, String password) {
		return repo.check(id, password);
	}
	@Override
	public List<Doctor> getAllDoctor() {
		return repo.getAllDoctor();
	}
	@Override
	public Doctor getById(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

}
