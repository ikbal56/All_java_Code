package com.te.springpureannotation;

import org.springframework.stereotype.Component;

//@Component("college")
public class CollegeStudent {

	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public CollegeStudent(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {

		this.samosa.display();
		System.out.println("Student is reading book");
	}

}
