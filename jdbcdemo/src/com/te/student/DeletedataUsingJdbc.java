package com.te.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeletedataUsingJdbc {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url, username, password);
			
			//Statement 
//			Statement st=con.createStatement();
//			String query="delete from student where roll_number=5";
//			st.executeUpdate(query);
			
			//using prepared statement
			
			String query="delete from student where roll_number=?";
			
			
			PreparedStatement pt=con.prepareStatement(query);
			pt.setInt(1, 6);
			pt.executeUpdate();
			
			con.close();
			System.out.println("data is deleted......!");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
