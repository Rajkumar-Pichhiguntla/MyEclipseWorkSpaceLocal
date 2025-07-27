package com.metadata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.utils.DBConnection;

public class MetaDataInfo {
		public static void main(String[] args) throws SQLException {
			DBConnection db=new DBConnection();
			Connection connection=db.getConnection();
			
			String query="select * from employees";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
//			System.out.println("Column count"+metaData.getColumnCount());
//			System.out.println(metaData.getColumnName(1)+"\t"+metaData.getColumnName(2)+"\t"+metaData.getColumnName(3));
			System.out.println(metaData.getTableName(1));
			int count=metaData.getColumnCount();
			for(int i=1;i<=count;i++) {
				System.out.print(metaData.getColumnName(i)+"("+metaData.getColumnTypeName(i)+")"+"\t");
			}
			System.out.println();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
}
