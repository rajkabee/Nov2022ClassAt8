package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingPreparedStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username,password);
		System.out.println("Connected!");
		User user = new User("moderator", "password", true);
		String query = "insert into user (username, password, active) values(?,?,?)";		
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, user.getUsername());
		pstm.setString(2, user.getPassword());
		pstm.setBoolean(3, user.isActive());
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("User saved to the database!");
		}
		else {
			System.out.println("User couldn't be saved to the database!");
		}
		pstm.close();
		con.close();
	}
}
