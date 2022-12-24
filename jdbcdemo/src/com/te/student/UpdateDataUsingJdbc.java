package com.te.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDataUsingJdbc {

	public static void main(String[] args) {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost/jdbcdb";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url, username, password);
			String query="update student set name=?,address= ? where roll_number= ? ";	
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		   System.out.println("Enter new Name");
		   String name=br.readLine();
			
		   
		   System.out.println("Enter new address");
		   String city=br.readLine();
		   
		   System.out.println("Enter roll number");
		   int id=Integer.parseInt(br.readLine());
		   
		   PreparedStatement psmt=con.prepareStatement(query);
		   
		   psmt.setString(1, name);
		   psmt.setString(2, city);
		   psmt.setInt(3, id);
		   
		   psmt.executeUpdate();
		   System.out.println("successfully updated");
		   
		   con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
