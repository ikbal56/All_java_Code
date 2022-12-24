package com.te.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.Entity.Doctor;
import com.te.service.DoctorService;

@Controller
@RequestMapping("/patient/appointment")
public class AppointmentController {
@Autowired
	private DoctorService service;
	
@GetMapping("/getAll")
public String getAllDoctor(ModelMap map) {
	if(service.getAllDoctor() != null) {
		List<Doctor> doctor = new ArrayList<Doctor>();
		doctor.addAll(service.getAllDoctor());
		map.addAttribute("alldoctor",doctor);
	}
	else {
		map.addAttribute("msg","UNable to get Doctor Details");
	}
	return "Appointment";
}


	
}
