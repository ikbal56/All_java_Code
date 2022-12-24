package com.te.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.studentdto.Student;
import com.te.studentdto.StudentResponse;
import com.te.studentservice.StudentService;

@RestController
public class MyController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping(path="/add", produces= { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public StudentResponse addDetails(@RequestBody Student student) {
		
		StudentResponse response=new StudentResponse();
		
		if (service.addStudent(student)) {
			response.setCode(200);
			response.setStatus("Successfully");
			response.setDesc(" hey your details added ");
			
		} else {
			
			response.setCode(400);
			response.setStatus("UnSuccessfully");
			response.setDesc(" your details are not added please try again ");

		}
		
		return response;
		
	}
	
	
	

	
}
