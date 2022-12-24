package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDetails {
	
	public static void main(String[] args) throws SQLException {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url, username, password);
			String query="select * from emp where emp_id=?";
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter Your employee id");
			int empid=scan.nextInt();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, empid);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				int employeeid=rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				System.out.println("Employee Id:"+employeeid+" "+"name:"+" "+name+" "+"city:"+city);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
