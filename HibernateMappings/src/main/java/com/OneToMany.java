package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Department;
import com.model.Employee;
import com.utils.HibernateUtils;

public class OneToMany {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		insert(session);
		
//		Employee employee = session.find(Employee.class, 1);
		Department dept=session.find(Department.class, 101);
		System.out.println(dept+" ->"+dept.getEmployees());
	}

	private static void insert(Session session) {
		Department dept=new Department(101,"CSE");
		Employee emp1=new Employee("Anil");
		Employee emp2=new Employee("Srikanth");
		emp1.setDepartment(dept);
		emp2.setDepartment(dept);
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		
		dept.setEmployees(employees);
		
		
		Department dept2=new Department(102,"ECE");
		Employee emp3=new Employee("Shiva");
		Employee emp4=new Employee("Raj");
		emp3.setDepartment(dept2);
		emp4.setDepartment(dept2);
		
		List<Employee> employees1=new ArrayList<Employee>();
		employees1.add(emp3);
		employees1.add(emp4);
		
		dept2.setEmployees(employees1);
		
		
		
		session.beginTransaction();
		session.persist(dept2);
		session.getTransaction().commit();
	}

}
