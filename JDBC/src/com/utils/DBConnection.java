package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection connection=null;
	public Connection getConnection() throws SQLException {
		if(connection == null) {
			connection=DriverManager.getConnection(Constants.url,Constants.userName,Constants.password);
			return connection;
		}
		return connection;
		
	}
}
