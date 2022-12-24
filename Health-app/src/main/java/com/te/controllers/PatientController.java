package com.te.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;
import com.te.repository.DatenTimeinter;
import com.te.service.DatendTimeService;
import com.te.service.DoctorService;
import com.te.service.PatientServiceInter;

@Controller
@RequestMapping("/patient")
public class PatientController {
	private int patientid; 
	@Autowired
	private PatientServiceInter service;
	@Autowired
	private DoctorService docService;
@Autowired
	private DatendTimeService dateService;
	@GetMapping("/insert")
	public String insert() {
		return "PSignUp";
	}

	@PostMapping("/registration")
	public String insertDoctorData(ModelMap map, Patient doctor) {
		if (service.insert(doctor)) {
			map.addAttribute("msg", "SignUp Successfull below Are Your Details");
			map.addAttribute("object", doctor);
		} else {
			map.addAttribute("msg", "SignUp Unsuccessfull Check your Credentials");
		}
		return "PRegistrationResp";
	}

	@GetMapping("/login")
	public String loginpage() {
		return "Plogin";
	}

	@PostMapping("/Login")
	public String loginDoctor(int id, String password,ModelMap map) {
		if (service.check(id, password)) {
			map.addAttribute("msg", "Login successfull");
			patientid = id;
		}
		else {
			map.addAttribute("msg", "Login unsuccessfull");
		}
		return "PloginResp";
	} 
	@GetMapping("/appointment/appoint")
	public String appointment(int doctorId,String calender,String time, ModelMap map) {
		Doctor doctor = docService.getById(doctorId);
		Patient patient = service.getById(patientid, doctor);
		map.addAttribute("patient", patient);
		if(dateService.insertDate(calender, time, doctor)) {
			
			
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
        String date1=	dateFormat.format(date);
        map.addAttribute("date", date1);
		return "AppointResp";
	}
}
