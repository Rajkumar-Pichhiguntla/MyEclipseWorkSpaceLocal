package com.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.utils.DBConnection;

public class SignUp {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String username=sc.nextLine();
		System.out.println("Enter password:");
		String password=sc.nextLine();
		
		DBConnection db=new DBConnection();
		Connection connection=db.getConnection();
		Statement st=connection.createStatement();

		String query="insert into users values('"+username+"','"+password+"')";
		st.executeUpdate(query);
		System.out.println("Values Inserted..");
		
		
	}

}
