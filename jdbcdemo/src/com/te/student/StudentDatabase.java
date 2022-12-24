package com.te.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDatabase {
	
	
	private static Connection connection=null;
	public static void main(String[] args) {
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println( "root");
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
		connection=	DriverManager.getConnection(url, username, password);
			
			String query="insert into student(name,percentage,address) values(?,?,?)";
			
			PreparedStatement pst=connection.prepareStatement(query);
			pst.setString(1, "Arip");
			pst.setDouble(2,65.5);
			pst.setString(3, "kolkata");
			
		int rowsAffected=pst.executeUpdate();
			
			System.out.println("number of rows affected:"+rowsAffected);
			connection.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		// throw new RuntimeException("something went wrong");
		}
		
	}

}
