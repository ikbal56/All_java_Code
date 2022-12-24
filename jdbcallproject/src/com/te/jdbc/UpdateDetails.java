package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDetails {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url, username, password);
			String query="update emp set emp_name=?,emp_city=? where emp_id=?";
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your name");
			String name=sc.nextLine();
			System.out.println("Enter your city name");
			String city=sc.nextLine();
			System.out.println("Enter your Employee id");
			int id=Integer.parseInt(sc.next());
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2, city);
			pst.setInt(3, id);
			
			pst.executeUpdate();
			System.out.println("successfully updated");
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
