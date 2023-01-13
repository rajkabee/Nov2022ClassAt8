package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username,password);
		System.out.println("Connected!");
		System.out.println("Enter the id of the user to be deleted: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.close();
		String query = "delete from user where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		
		
		if(i==1) {
			System.out.println("User deleted from the table!");
		}
		else {
			System.out.println("User couldn't deleted from the table!");
		}
		pstm.close();
		con.close();
	}
}
