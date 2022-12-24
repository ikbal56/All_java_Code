package com.te.healthcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.healthdto.Doctors;
import com.te.healthdto.Patients;
import com.te.healthservice.HealthService;

@Controller
public class MyController {
	
	@Autowired
	private HealthService service;
	
	
	@GetMapping("/home")
	public String getHome() {
		
		return "homepage";
	}
	
	
	

	
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return  "signupform";
		
		
	}

	@GetMapping("/signupforpatient")
	public  String signup() {
		
		return  "patientsignupform";
		
	}
	
	
	
	@GetMapping("/docsignup")
	public String signupDetails() {
		
		return "doctorsignupform";
		
	}
	
	@GetMapping("/login")
	public String getLogin() {
		
		return  "loginform";
	}
	
	@GetMapping("/doclogin")
	public String doctorLogin() {
		
		return "loginfordoctor";
		
	}
	
	@PostMapping("/dlogin")
	public String login(int doctorId,String password,ModelMap map) {
		
		if (service.getDoctor(doctorId, password)) {
			map.addAttribute("msg","Successfully login");
			
			
		} else {
			map.addAttribute("msg","Invalid UserName or password");

		}
		
		
		
		return"doctorloginconfirmation";
	}
	
	@GetMapping("/patlogin")
	public String patientLogin() {
		
		return "loginforpatient";
	}
	
	@PostMapping("/plogin")
	public String patLogin(int patientId,String password,ModelMap map) {
		
		if (service.getPatient(patientId, password)) {
			map.addAttribute("msg","Successfully Login");
			
		} else {
			map.addAttribute("msg","Invalid username or password");

		}
		
		return "patientloginconfirmation";
	}
	
	
	@GetMapping("/docprocess")
	public String addDetails(Doctors doctor,ModelMap map) {
		
		if (service.insertDetails(doctor)) {
			map.addAttribute("msg","Successfully added");
			map.addAttribute("doc",doctor);
			
		} else {
			map.addAttribute("msg","Failed to Register");

		}
		return "docconfirmation";
		
	}
	
	@GetMapping("/patprocess")
	public String addPatient(Patients patient, ModelMap map) {
		
		if(service.insertPatient(patient)) {
			map.addAttribute("msg","Successfully added ");
			map.addAttribute("patients",patient);
			
		}else {
			
			map.addAttribute("msg","Sorry Failed to Register");
		}
		
		return "patconfirmation";
	}
}
