package com.comparator;

import java.util.Comparator;

public class DomainComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.domain.compareTo(emp2.domain);
	}

	
	
	

}
