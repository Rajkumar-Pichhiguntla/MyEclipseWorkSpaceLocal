package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

import com.comparator.Address;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<Integer>(Arrays.asList(2,5,4,5,10,9,10,17,20,10));
		
		nums.forEach((n)-> System.out.println(n));
		
		
		//List
		List<Integer> even=nums
				.stream()
				.filter((n)-> n%2 == 0) //Intermediate Operation
				.collect(Collectors.toList()); //Terminal Operation
		System.out.println("Even Numbers :"+even);
		
		List<Integer> odds=nums.stream().filter((n)-> n%2!=0).toList();
		System.out.println("Odds : "+odds);
		
		List<Integer> sortedList=nums.stream().sorted().toList();
		System.out.println("Sorted List : "+sortedList);
		
		List<Integer> reverseSortedList=nums.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Sorted List in Reverse Order : "+reverseSortedList);
		
		List<Integer> removeDuplicates=nums.stream().distinct().toList();
		System.out.println("nums List without Duplicates :"+ removeDuplicates);
		
		Integer secondHighest=nums
				.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println("second Highest num :"+secondHighest);
		
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(1,"Raj",110000,"ECE",new Address("Kurnool", 518466)));
		employees.add(new Employee(5,"Pavan",250000,"Mech",new Address("Hyderabad", 500038)));
		employees.add(new Employee(3,"Vishnu",75000,"Mech",new Address("Nandyal", 518408)));
		employees.add(new Employee(4,"Gaja",100000,"ECE",new Address("Vijayawada", 521321)));
		
		employees.forEach((e)->System.out.println(e));
		
		List<Employee> filterEmployee=employees
				.stream()
				.filter((emp)-> emp.getSalary() > 100000)
				.toList();
		
		System.out.println("Employees salary gretaer than 1 lakh : "+filterEmployee);
		
		
		List<Employee> sortedEmployees=employees
				.stream()
				.sorted((emp1,emp2) -> Integer.compare(emp1.id,emp2.id))
				.toList();
		
		System.out.println("Sorted Employees list : "+sortedEmployees);
		
		List<Employee> salaryIncrement = employees
				.stream()
				.map((emp)-> new Employee(emp.id,emp.name,emp.increaseSalary(5000),emp.department,emp.address))
				.toList();
		System.out.println("List of employees with salary increment: "+salaryIncrement);
		
		
		//StartsWith
		
		employees.stream().filter((emp)-> emp.name.startsWith("R")).forEach((emp)->System.out.println(emp));
		
		//sort using pincode
		
		List<Employee> sortPincodes=employees
			.stream()
			.sorted((emp1,emp2)-> Integer.compare(emp1.address.getPincode(), emp2.address.getPincode()) )
			.toList();
		
		System.out.println(sortPincodes);
		
		Optional<Employee> maxSalary=employees.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(maxSalary);
		
		//grouping employees by department
		System.out.println("---------------------");
		Map<String, Set<Employee>> byDepartment=employees
				.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toSet()));
		System.out.println(byDepartment);
		
		//No of employees in each department
		
		Map<String,Long> countOfEmployees=employees
				.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			
		System.out.println(countOfEmployees);
		
		Map<String, Double> averageSalary=employees
				.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(averageSalary);
		
		List<Employee> employeeSortedList=employees
				.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.toList();
		System.out.println(employeeSortedList);
		
		boolean greater=employees.stream().anyMatch((e)-> (e.salary)<200000);
		System.out.println(greater);
		
		
	}	
		
		
		
	

}
