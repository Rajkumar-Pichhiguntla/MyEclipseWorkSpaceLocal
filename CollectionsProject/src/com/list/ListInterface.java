package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>(Arrays.asList("Raj","Pavan","Vishnu","Shiva"));
		Set<String> setNames=new HashSet<>();
		setNames.add("Raj");
		setNames.add("Raj");
		setNames.add("Pavan");
		setNames.add("Pavan");
		System.out.println(names);
		System.out.println(setNames);
		
		
		boolean isContains=containsName(names, "Ra");
		System.out.println(isContains);
		
		List<Integer> nums=new ArrayList<>(Arrays.asList(2,4,1,6,8,2,3,9,2));
		List<Integer> sorted= nums.stream().distinct().toList();
		System.out.println(sorted);
		
		List<List<Integer>> list=new ArrayList<>();
		list.add(Arrays.asList(1,3));
		list.add(Arrays.asList(4,6));
		list.add(Arrays.asList(8,2));
		list.add(Arrays.asList(5,9));
		System.out.println(list);
		List<Integer> totalList=list.stream().flatMap(li->li.stream()).toList();
		System.out.println(totalList);
		
	}
	public static boolean containsName(List<String> list,String name) {
		
		for(String name1:list) {
			if(name1.equals(name)) {
				return true;
			}
		}
		return false;
		
	}

}
