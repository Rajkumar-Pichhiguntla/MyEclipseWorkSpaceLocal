package com.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.utils.DBConnection;

public class UserTable {
	
	public static void main(String[] args) throws SQLException {
		DBConnection db=new DBConnection();
		Connection connection=db.getConnection();
		
		Statement st=connection.createStatement();
		String query="create table users(username varchar(20), password varchar(20))";
		st.executeUpdate(query);
		System.out.println("table created");
	}
	

}
