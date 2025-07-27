package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckDuplicates {
	
	public static boolean containsDuplicates(int[] nums) {
		Map<Integer,Boolean> map=new HashMap<>();
		
		for(int num:nums) {
			if(map.containsKey(num)) {
				System.out.println("Map : "+map);
				return true;
			}
			map.put(num, true);
		}
		System.out.println(map);
		return false;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	 int[] nums= {1,2,3,1,2};
	 
	 boolean result =CheckDuplicates.containsDuplicates(nums);
	 System.out.println(result);
	}

}

//Check For Duplicates return ture

/*List<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(1);
list.add(2);

System.out.println(list);


Map<Integer,Boolean> checkDuplicates=new HashMap<>();

for(Integer num:list) {
	if(checkDuplicates.containsKey(num)) {
		
	}
	else {
		checkDuplicates.put(num, false);
	}
}
System.out.println(checkDuplicates);*/
