package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username,password);
		System.out.println("Connected!");
		String query = "select * from user";
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs = pstm.executeQuery();
		ArrayList<User> users = new ArrayList<>();
		
		while(rs.next()) {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setActive(rs.getBoolean("active"));
			users.add(user);
		}
		if(users.size()>0) {
			users.forEach(System.out::println);
		}
		else {
			System.out.println("no user found!");
		}
		pstm.close();
		con.close();
	}
}
