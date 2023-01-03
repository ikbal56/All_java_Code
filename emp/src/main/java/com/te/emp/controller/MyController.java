package com.te.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.emp.dto.Emp;
import com.te.emp.dto.EmpResponse;
import com.te.emp.service.EmpService;

@RestController
public class MyController {
	
	@Autowired
	private EmpService service;
	
	@PostMapping( "/insert" )
	@ResponseBody
	public EmpResponse addDetails(@RequestBody Emp emp) {
		EmpResponse response=new EmpResponse();
		if (service.insertDetails(emp)!=null) {
			
			response.setStatusCode(200);
			response.setMessage("Successfully ");
			response.setDesc(" Your details are added");
			
		} else {
			
			response.setStatusCode(400);
			response.setMessage("UnSuccessfully ");
			response.setDesc(" Your details are not added");

		}
		
		return response;
	}
	

}
