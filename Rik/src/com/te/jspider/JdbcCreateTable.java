package com.te.jspider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreateTable {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jspider";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "create table student(student_id int(10)primary key not null,student_name varchar(30) not null,city varchar(20)not null)";
			Statement st = con.createStatement();
			int rowseffected = st.executeUpdate(query);
			System.out.println("Successfully table created" + rowseffected);
			con.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
