package com;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperations {
	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> nums=new TreeSet<Integer>();
		nums.add(20);
		nums.add(40);
		nums.add(1);
		nums.add(15);
		nums.add(null);
		System.out.println(nums);
		
		Set<Integer> nums1=new HashSet<Integer>(Arrays.asList(20,40,10,20,30,100,200,10,3,5,2,7,4,9,33));
		
		System.out.println(nums1);
		
		
		Set<String> names=new TreeSet<String>(Arrays.asList("ABC","AAA","BCA","ACB"));
		
		System.out.println(names);
		
		Set<Integer> numsLinkedHash=new LinkedHashSet<Integer>(Arrays.asList(20,40,10,20,30,100,200,10,3,5,2,7,4,9,33));
		System.out.println(numsLinkedHash);
		
	}

}
