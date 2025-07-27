package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Course;
import com.model.Department;
import com.model.Employee;
import com.model.Passport;
import com.model.Student;
import com.model.User;

public class HibernateUtils {
	
	public static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration cfg=new Configuration();
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Passport.class);
			cfg.addAnnotatedClass(Department.class);
			cfg.addAnnotatedClass(Employee.class);
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Course.class);
			cfg.configure();
			
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
		}
		return sessionFactory;
	}

}
