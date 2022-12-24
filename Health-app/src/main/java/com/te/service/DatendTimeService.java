package com.te.service;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;

public interface DatendTimeService {
	public boolean insertDate(String date, String time,Doctor doctor);
public boolean insertpatientdate(String date, String time,Patient patient);
}
