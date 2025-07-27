package om.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.utils.DBConnection;

public class BatchProcessing {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		DBConnection db=new DBConnection();
		Connection connection=db.getConnection();
		PreparedStatement st = connection.prepareStatement("insert into employees values(?,?,?)");
		
		
		for(int i=0;i<=3;i++) {
			System.out.println("Enter EmpId:");
			int empId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter EmpEmail:");
			String empEmail=sc.nextLine();
			System.out.println("Enter EmpSalary:");
			double empSalary=sc.nextDouble();
			sc.nextLine();
			st.setInt(1, empId);
			st.setString(2, empEmail);
			st.setDouble(3, empSalary);
			st.addBatch();
		}
		
		
//		
//		st.setInt(1, 103);
//		st.setString(2, "Pavan@gmail.com");
//		st.setDouble(3, 30000);
//		
//		st.addBatch();
//		
//		st.setInt(1, 104);
//		st.setString(2, "lalli@gmail.com");
//		st.setDouble(3, 24000);
//		
//		st.addBatch();
//		
		st.executeBatch();
		
//		st.executeUpdate();
		System.out.println("inserted data..");
	}

}
