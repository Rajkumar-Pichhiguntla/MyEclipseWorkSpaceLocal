package com.example;
import java.util.*;

public class CheckDetails {
	
//	static Scanner sc=null;
//	Map<String,Integer> map=new LinkedHashMap<>();
//	for(int i=0;i<3;i++) {
//		System.out.println("enter name:");
//		String name=sc.next();
//		System.out.println("enter password:");
//		int pass=sc.nextInt();
//		map.put(name, pass);
//	}
	public static void main(String[] args) {
		Customer c1=new Customer("Raj", 1234);
		Customer c2=new Customer("pavan", 2345);
		Customer c3=new Customer("Vishnu", 3456);
		
		System.out.println(CheckDetails.checkDetails(c1.getName(),c1.getPassword()));
	}

	
	public static  String checkDetails(String name,int password) {
		
		Map<String,Integer> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name to check:");
		String name1=sc.next();
		System.out.println("enter password to check:");
		int pass=sc.nextInt();
		
		
		if(name1.equals(name) && pass==password) {
			
			map.put(name1, pass);
		}
		else {
			System.out.println("Invalid details");
		}
		return "Entered Details are matched "+ map;
		
	}
	
}
