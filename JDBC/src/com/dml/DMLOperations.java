package com.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLOperations {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Register Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Registered");
		
		//Establish Connection
		String url="jdbc:mysql://localhost:3306/flm_adv_java";
		String userName="root";
		String password="admin";
		
		Connection connection=DriverManager.getConnection(url,userName,password);
		
		//Create Statement 
		Statement statement=connection.createStatement();
		//Prepare query
//		String query="insert into employees values(202,'dog@gmail',34 000)";
//		
//		//Execute query
//		statement.executeUpdate(query);
//		
//		System.out.println("inserted Data");
		
//		String query2="update employees set empSalary=35000 where empId=101";
//		statement.executeUpdate(query2);
//		System.out.println("Updated Data..");
		
		String query3="Delete from employees where empSalary<10000";
		statement.executeUpdate(query3);
		System.out.println("Deleted data");
	}

}
