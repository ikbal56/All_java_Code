package com.te.learn;

public class AwesomeJava {

	private String schoolName;
	
	private String studentName;

	private int sid;

	private String mob;

	private String city;

	public AwesomeJava(String schoolName, String studentName, int sid, String mob, String city) {
		super();
		this.schoolName = schoolName;
		this.studentName = studentName;
		this.sid = sid;
		this.mob = mob;
		this.city = city;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student Details [schoolName=" + schoolName + ", studentName=" + studentName + ", sid=" + sid + ", mob="
				+ mob + ", city=" + city + "]";
	}

}
