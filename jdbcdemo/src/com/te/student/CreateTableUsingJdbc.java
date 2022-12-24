package com.te.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableUsingJdbc {
	
	public static void main(String[] args) {   
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url, username, password);
			
			String query="create table EmployeeDetails(eId int(10) primary key auto_increment,TraineeName varchar(20)not null,Age int(10)not null,Gender varchar(11),City varchar(15))";
			
			Statement st=con.createStatement();
			int rowsAffected=st.executeUpdate(query);
			System.out.println("Table create successfully:"+rowsAffected);
			
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
