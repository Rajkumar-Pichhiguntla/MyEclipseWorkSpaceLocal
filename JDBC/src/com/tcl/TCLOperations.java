package com.tcl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.utils.DBConnection;

public class TCLOperations {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			DBConnection db=new DBConnection();
			connection = db.getConnection();
			connection.setAutoCommit(false);
			
			PreparedStatement prepareStatement = connection.prepareStatement("update employees set empSalary=? where empId=?");
			
			prepareStatement.setDouble(1, 13000);
			prepareStatement.setInt(2, 101);
			
			prepareStatement.executeUpdate();
			System.out.println("updated..");
			connection.commit();
		}
		catch(Exception e) {
			connection.rollback();
			
		}
	}

}
