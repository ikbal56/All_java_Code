package com.te.service;
import java.util.List;

import com.te.Entity.Doctor;
public interface DoctorService {
	public boolean insert(Doctor doctor);
public boolean check(int id,String password);
public List<Doctor> getAllDoctor();
public Doctor getById(int id);
}
