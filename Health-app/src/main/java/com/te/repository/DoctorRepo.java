package com.te.repository;

import java.util.List;

import com.te.Entity.Doctor;

public  interface DoctorRepo  {
public boolean insert(Doctor doctor);
public boolean check(int id,String password);
public List<Doctor> getAllDoctor();
public Doctor getById(int id);
}
