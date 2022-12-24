package com.te.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class FetchDataUsingJdbc {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			//fetch all table details
			//String query="select * from student";
			
			//fetch particular row details
			String query="select * from student where roll_number= ?";
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the roll number");
			int rollnumber=scan.nextInt();
			
			
			Connection con= DriverManager.getConnection(url, username, password);
			//Statement st=con.createStatement();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, rollnumber);
			ResultSet res=pst.executeQuery();

			
//			while(res.next()) {
//				int roll=res.getInt(1);
//				String name=res.getString(2);
//				double marks=res.getDouble(3);
//				String address=res.getString(4);
//				System.out.println(roll+"-----"+name+"-----"+marks+"----"+address);
//			}
				
			res.next();
			String name=res.getString("name");
			System.out.println(name);
			
			pst.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			//throw new RuntimeException("no data found");
		}
		
		
	}

}
