package com.te.springpureannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.te.springpureannotation")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		
		return new Samosa();
	}
	
	
	
	@Bean
	public CollegeStudent getStudent() {
		
		CollegeStudent student=new CollegeStudent(getSamosa());
		return student;
	}
}
