package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username,password);
		System.out.println("Connected!");
		User user = new User(5, "accountant", "password", true);
		String query = "update user set username=?, password=?, active=? where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, user.getUsername());
		pstm.setString(2, user.getPassword());
		pstm.setBoolean(3, user.isActive());
		pstm.setInt(4, user.getId());
		int i = pstm.executeUpdate();
		
		
		if(i==1) {
			System.out.println("Table Updated!");
		}
		else {
			System.out.println("Table couldn't be updated!");
		}
		pstm.close();
		con.close();
	}
}
