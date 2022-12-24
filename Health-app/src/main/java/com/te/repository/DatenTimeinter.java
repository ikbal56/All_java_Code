package com.te.repository;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;

public interface DatenTimeinter {
public boolean insertDate(String date, String time,Doctor doctor);
public boolean insertpatientdate(String date, String time,Patient patient);

}
