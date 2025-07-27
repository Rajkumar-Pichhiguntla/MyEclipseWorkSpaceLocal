package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.xdevapi.Type;
import com.utils.DBConnection;

public class StoredProcedure {
	public static void main(String[] args) throws SQLException {
		
		DBConnection db=new DBConnection();
		Connection connection = db.getConnection();
		
//		CallableStatement prepareCall = connection.prepareCall("{CALL getAllEmployees()}");
//		CallableStatement st = connection.prepareCall("{CALL getEmployeeById(?,?)}");
//		st.setInt(1, 101);
//		st.setString(2, "raj@gmail.com");
		
//		CallableStatement st2 = connection.prepareCall("{CALL getSalaryById(?,?)}");
//		st2.registerOutParameter(1, Types.DECIMAL);
//		st2.setInt(2, 101);
		
		CallableStatement st3 = connection.prepareCall("{CALL increaseSalary(?)}");
		st3.setDouble(1, 1200);
		st3.registerOutParameter(1, Types.DECIMAL);
		st3.execute();
		double salary = st3.getDouble(1);
		System.out.println(salary);
		
		
//		ResultSet rs = st2.executeQuery();
//		
//		System.out.println("EmpId\tEmpEmail\tEmpSalary");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
//		}
	}

}
