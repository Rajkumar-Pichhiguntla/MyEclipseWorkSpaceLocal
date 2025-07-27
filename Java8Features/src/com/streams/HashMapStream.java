package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapStream {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Raj");
		map.put(0, "gaja");
		map.put(4, "Raj");
		map.put(5, "vishnu");
		map.put(6, "Pavan");
		map.put(2, "vishnu");
		map.put(3, "Pavan");
		System.out.println(map);
		
		map
			.entrySet()
			.stream()
			.forEach((entry)->System.out.println(entry.getKey()+" - "+entry.getValue()));
		
		List<Integer> keys=map
			.keySet()
			.stream()
			.toList();
		System.out.println(keys);
		
		List<String> values=map
				.values()
				.stream()
				.toList();
		System.out.println(values);
		
		Map<Integer,String> greaterThanTwo=map
				.entrySet()
				.stream()
				.filter(entry-> entry.getKey() > 2)
				.collect(Collectors.toMap(entry->entry.getKey(), entry-> entry.getValue()));
		System.out.println(greaterThanTwo);
		
		Map<String,String> courses=new HashMap<String,String>();
		
		courses.put("String1", "Course1");
		courses.put("String2", "Course2");
		courses.put("String3", "Course1");
		courses.put("String4", "Course1");
		
		Map<String,String> filteredMap=courses
			.entrySet()
			.stream()
			.filter((entry)-> entry.getValue().equals("Course1"))
			.collect(Collectors.toMap(entry-> entry.getKey(), entry->entry.getValue()));
		System.out.println(filteredMap);
		
		
		//Lists
		List<Integer> nums=new ArrayList<>(Arrays.asList(20,4,7,10,8));
		
		
		int min=nums
		 	.stream()
		 	.mapToInt(n->n)
		 	.min()
		 	.getAsInt();
		System.out.println(min);
		Long count=nums
			.stream()
			.filter(n->n%2==0)
			.count();
		System.out.println(count);
		
		int sum=nums
			.stream()
			.mapToInt(n->n)
			.sum();//Some only works on primitive dataTypes Thats why we uses mapToInt() operation to convert
					//from Integer to int.
		System.out.println(sum);
		
		List<Integer> fiveMultiples=nums
				.stream()
				.filter(n->n%5==0)
				.toList();
		System.out.println(fiveMultiples);
		
		int evenSum=nums
				.stream()
				.filter(n->n%2==0)
				.mapToInt(n->n)
				.sum();
		System.out.println(evenSum);
		
		double numsAvg=nums
				.stream()
				.mapToDouble(n->n)
				.average()
				.getAsDouble();
		
		System.out.println(numsAvg);
		
		int max=nums
				.stream()
				.mapToInt(n->n)
				.max()
				.getAsInt();
		System.out.println(max);
		
		List<List<String>> words=new ArrayList<List<String>>();
		words.add(Arrays.asList("hi","bye"));
		words.add(Arrays.asList("one","two"));
		words.add(Arrays.asList("gm","gn"));
		
		System.out.println(words);
		
		List<String> list=words
				.stream()
				.flatMap(li->li.stream())
				.toList();
		System.out.println(list);
		
		
		List<Integer> list1=new ArrayList<>(Arrays.asList(20,4,7,10,8));	
		
		list1.parallelStream().forEach(n->System.out.println(n));
		System.out.println("-------");
		list1.stream().limit(2).forEach(n->System.out.println(n));
		System.out.println("-------");
		boolean allMatch=list1.stream().allMatch(n->n>0);
		System.out.println(allMatch);
		
	}

}
