package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;
import com.te.repository.DatenTimeImp;

@Service
public class DatendTimeServiceImp implements DatendTimeService {
@Autowired
	private DatenTimeImp repo;
	@Override
	public boolean insertDate(String date, String time, Doctor doctor) {
				return repo.insertDate(date, time, doctor);
	}
	@Override
	public boolean insertpatientdate(String date, String time, Patient patient) {
		return repo.insertpatientdate(date, time, patient);
	}

}
