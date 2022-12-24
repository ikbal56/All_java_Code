package com.te.employeecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.employeedto.Employee;
import com.te.employeedto.EmployeeResponse;
import com.te.employeeservice.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private  EmployeeService service;
	
	@PostMapping(path="/add", produces= {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE},consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeResponse addDetails(@RequestBody Employee employee) {
		
		EmployeeResponse response=new EmployeeResponse();
		
		if (service.addEmployee(employee)) {
			
			response.setStatusCode(200);
			response.setStatus("Successfully added");
			response.setDesc("Your details added successfully");
			
		} else {

			response.setStatusCode(400);
			response.setStatus("Something went Wrong ");
			response.setDesc("Your details not added please try again");
		}
		
		return response;
	}

	
}
