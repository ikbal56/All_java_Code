package com.te.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcPracticeInsert {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			
			Connection con=DriverManager.getConnection(url,username,password);
			String query="insert into student(name,percentage,address) values(?,?,?)";
			
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, "Arish");
			psmt.setDouble(2, 63);
			psmt.setString(3,"kadikola");
			
			int rowsAffected=psmt.executeUpdate();
			System.out.println("inserted successfully:"+ rowsAffected);
			
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
