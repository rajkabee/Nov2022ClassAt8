package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username,password);
		System.out.println("Connected!");
		User user = new User("manager", "password", true);
		String query = "insert into user (username, password, active) values('"
				+ user.getUsername() +"','"
				+ user.getPassword() + "',"
				+ user.isActive() +")";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==1) {
			System.out.println("User saved to the database!");
		}
		else {
			System.out.println("User couldn't be saved to the database!");
		}
		stm.close();
		con.close();
	}
}
