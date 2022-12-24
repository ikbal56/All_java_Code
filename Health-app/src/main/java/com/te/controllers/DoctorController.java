package com.te.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.Entity.Doctor;
import com.te.Entity.Patient;
import com.te.service.DoctorService;
@Controller
@RequestMapping("/doctor")
public class DoctorController {
	private int doctorid;
@Autowired
	private DoctorService service;
	@GetMapping("/insert")
	public String insert() {
		return "SignUp";
	}
	@PostMapping("/registration")
	public String insertDoctorData(ModelMap map,  Doctor doctor ) {
		if(service.insert(doctor)) {
		map.addAttribute("msg","SignUp Successfull below Are Your Details");
		map.addAttribute("object", doctor);
		}else {
			map.addAttribute("msg", "SignUp Unsuccessfull Check your Credentials");
		}
		return "RegistrationResp" ;		
	}
	@GetMapping("/login")
	public String loginpage() {
		
	return "Appolo";
	}
	@PostMapping("/Login")
	public String loginDoctor(int id ,String password,ModelMap map) {
		if(service.check(id, password)) {
			map.addAttribute("msg", "Login successfull");
			doctorid=id;
		}
		else {
			map.addAttribute("msg", "login successfull");
		}
		return "loginResp";
	}
	@GetMapping ("/reponse")
	public String logingPage(ModelMap map) {
	Doctor doctor=	service.getById(doctorid);
	List<Patient> patient = new ArrayList<Patient>();
 patient.addAll(doctor.getPatient());
map.addAttribute("allpatient", patient);
return "loginpageresp";
	} 
	
}
