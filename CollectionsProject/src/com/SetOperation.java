package com;

import java.util.HashSet;
import java.util.Iterator;

public class SetOperation {
	public static void main(String[] args) {
		
		HashSet<Integer> nums=new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(10);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		for(Integer num:nums) {
			System.out.println(num);
		}
		System.out.println("---------------------------");
		Iterator<Integer> iterator = nums.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
