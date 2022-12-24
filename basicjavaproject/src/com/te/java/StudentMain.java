package com.te.java;


import java.nio.file.AccessDeniedException;

import javax.naming.NamingException;

public class StudentMain {
	
	public static void main(String[] args) throws NamingException, AccessDeniedException {
		
		
		Student st=new Student();
		
		st.setName("Ikbal");
		st.setRollNumber(1);
		st.setPassword("ruksar");
		
		st.getPassword();
		//st.display();
	}

}
