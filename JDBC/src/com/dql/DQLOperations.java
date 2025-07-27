package com.dql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.utils.DBConnection;

public class DQLOperations {
	public static void main(String[] args) {
		try {
			DBConnection db=new DBConnection();
			Connection connection=db.getConnection();
			Statement statement=connection.createStatement();
			
			String query= "select * from employees";
			ResultSet rs=statement.executeQuery(query);
			System.out.println("empId\tEmail\tempSalary");
			while(rs.next()) {
				System.out.println(rs.getInt(0)+"\t"+rs.getString(1)+"\t"+rs.getDouble(2 ));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
