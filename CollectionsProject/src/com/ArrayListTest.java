 package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		
		li.add(10);
		li.add(20.5);
		li.add("Raj");
		li.add(false);
		li.add("Raj");
		li.add(new Employee("Raj",24));
		li.add(1,20); //override the value and reshuffle the entire array
		li.add(null);
		li.add(null);
		li.add(null);
		li.add(null);
		li.set(2, "FLM");//replaces the values at index
		
		li.remove(1);
		
//		li.clear();
//		System.out.println(li.isEmpty());
		
		System.out.println(li);
		System.out.println(li.size());
		
		List<String> list=new ArrayList<>(Arrays.asList("Raj","Pavan","Gaja"));
		ListIterator<String> iterator=list.listIterator(list.size());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous()+"");
		}
		
		System.out.println(li.get(1));
		System.out.println(li.isEmpty());
		System.out.println(li.contains("FLM"));
		System.out.println(li.indexOf("Raj"));
		System.out.println(li.lastIndexOf("Raj"));
		ArrayList a2=new ArrayList();
		
		a2.addAll(li);
		System.out.println(a2);
		li.clear();
		System.out.println(li);
		System.out.println(li.isEmpty());
		System.out.println(li.size());
		
		List<Integer> num1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> num2=List.of(1,2,3);
		num2.add(4);
		
		System.out.println(num2);
		Integer[] nums3=num2.toArray(new Integer[0]);
		System.out.println(Arrays.toString(nums3));
		
		num1.retainAll(num2);
		System.out.println(num1);
	}

}

class Employee{
	
	String name;
	int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
