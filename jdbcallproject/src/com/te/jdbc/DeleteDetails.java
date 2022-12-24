package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDetails {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url, username, password);
			
			String query="delete from emp where emp_id=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, 5);
			pst.executeUpdate();
			con.close();
			System.out.println("Your data successfully deleted");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
