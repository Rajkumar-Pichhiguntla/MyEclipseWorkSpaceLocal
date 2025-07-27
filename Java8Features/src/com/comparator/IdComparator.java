package com.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return Integer.compare(emp1.id, emp2.id);
	}
	

}
