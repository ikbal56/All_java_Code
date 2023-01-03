package com.te.collegeapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class College {
	
	@Id
	
	private int collegeId;
	private String collegeName;
	private String collegeLocation;
	
	@OneToOne(cascade =CascadeType.ALL)
	private Teacher teacher;

	public College(int collegeId, String collegeName, String collegeLocation, Teacher teacher) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		this.teacher = teacher;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeLocation() {
		return collegeLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeLocation="
				+ collegeLocation + ", teacher=" + teacher + "]";
	}
	
	

}
