package com.ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.utils.DBConnection;

public class Login {
	public static void main(String[] args) throws SQLException {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String username=sc.nextLine();
		System.out.println("Enter password:");
		String password=sc.nextLine();
		
		DBConnection db=new DBConnection();
		Connection connection=db.getConnection();
//		Statement st=connection.createStatement(); 
		
		
//		String query="SELECT * from users where username='"+username+"' and password='"+password+"'";
		String query="select * from users where username=? and password=?";
		PreparedStatement st=connection.prepareStatement(query);
		st.setString(1, username);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();
		
		if(rs.next()) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}

}
