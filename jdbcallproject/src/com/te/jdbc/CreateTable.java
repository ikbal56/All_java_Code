package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	public static void main(String[] args) throws SQLException {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url, username, password);
			String query="create table emp(emp_id int(20) primary key not null,emp_name varchar(50)not null,emp_city varchar(81)not null)";
			
			Statement st=con.createStatement();
			int rowseffected=st.executeUpdate(query);
			System.out.println("successfully table created:"+rowseffected);
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
