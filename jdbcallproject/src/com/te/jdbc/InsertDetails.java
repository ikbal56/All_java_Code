package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDetails {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			String query="insert into emp(emp_id,emp_name,emp_city) values(?,?,?)";
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1,9);
			pst.setString(2,"Sohel");
			pst.setString(3,"Kolkata");
			int rowseffected=pst.executeUpdate();
			System.out.println("Your details added Successfully:"+rowseffected);
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
