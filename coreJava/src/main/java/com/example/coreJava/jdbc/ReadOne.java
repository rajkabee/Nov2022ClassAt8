package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadOne {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username,password);
		System.out.println("Connected!");
		String query = "select * from user where id = ?";
		System.out.println("Enter the user id: ");
		int id = new Scanner(System.in).nextInt();
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		User user = new User();
		if(rs.next()) {
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setActive(rs.getBoolean("active"));
		}
		if(user.getUsername()!=null) {
			System.out.println(user);
		}
		else {
			System.out.println("no matching user found!");
		}
		pstm.close();
		con.close();
	}
}
