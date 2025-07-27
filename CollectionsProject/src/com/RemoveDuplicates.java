package com;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(20);
		nums.add(30);
		nums.add(20);
		nums.add(40);
		nums.add(50);
		nums.add(30);
		nums.add(20);
		
		
		ArrayList<Integer> tempArray=new ArrayList<Integer>();
		
		
		for(int i=0;i<nums.size();i++) {
			boolean isDuplicate=false;
			for(int j=0;j<tempArray.size();j++) {
				if(nums.get(i)==tempArray.get(j)) {
					isDuplicate=true;
					break;
				}
				
			}
			if(!isDuplicate) {
				tempArray.add(nums.get(i));
			}
	
		}
		System.out.println(nums);
		System.out.println(tempArray);
	}

}
