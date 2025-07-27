package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		List<Employee> employee =new ArrayList<Employee>();
		
		employee.add(new Employee(101,"Java","Rajkumar","Infosys",new Address("Kurnool", 518466)));
		employee.add(new Employee(230,"SQL","Vishnu","TCS",new Address("Hyderabad", 500038)));
		employee.add(new Employee(68,"Python","Gaja","Capgemini",new Address("Nandyal", 518408)));
		employee.add(new Employee(140,"C","Pavan","Deloitte",new Address("Vijayawada", 521321)));
		
		System.out.println(employee);
		
		Collections.sort(employee, new IdComparator());
		
		System.out.println(employee);
		
		Collections.sort(employee,new NameComparator());
		System.out.println(employee);
		
		Collections.sort(employee,new DomainComparator());
		
		System.out.println(employee);
		
		
		//Anonymous Inner class
		
		Comparator<Employee> companyComparator=new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				
				return emp1.company.compareTo(emp2.company);
			}
		};
		Collections.sort(employee,companyComparator);
		System.out.println(employee);
		
		
		
		Comparator<Employee> lambdaComparator=(emp1,emp2)->{return Integer.compare(emp1.id,emp2.id);};
		Collections.sort(employee,lambdaComparator);
		System.out.println("With Lambda : "+employee);
		
		Comparator<Employee> nameComparator=(emp1,emp2)->emp1.name.compareTo(emp2.name);
		Collections.sort(employee,nameComparator);
		System.out.println(employee);
		
		
		
		Collections.sort(employee,(emp1,emp2)-> {return Integer.compare(emp1.id, emp2.id);});
		System.out.println("With Single Collections.sort() = "+employee);
		
		//With address Pincode
		
		Collections.sort(employee,(emp1,emp2)-> {return Integer.compare(emp1.address.pincode, emp2.address.pincode);});
		System.out.println(employee);
	}

}
