package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeTest {
	
	public static void main(String[] args) {
		List<Double> decimals=new ArrayList<>(Arrays.asList(2.53,5.03,4.2,7.56,9.00));
		
		List<Double> reverseDecimals=decimals.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Reverse order of Decimals : "+reverseDecimals);
		System.out.println("---------------------------------");
		List<String> strings=new ArrayList<>(Arrays.asList("Hello","welcome","Core","Java"));
		
		String result= strings.stream().collect(Collectors.joining(",","[","]"));
		System.out.println("Adding prefix ,suffix,delimeter to Array of Strings : "+result);
		System.out.println("---------------------------------");
		String str="Hello";
		Map<Object, Long> map=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println("Frequncy Of Characters in string : "+map);
		System.out.println("---------------------------------");
		List<Integer> arr1=new ArrayList<Integer>(Arrays.asList(10,4,2,8,10,4,20));
		List<Integer> arr2=new ArrayList<Integer>(Arrays.asList(4,6,20,6,43,20,4));
		
		List<Integer> arr3=Stream.concat(arr1.stream(), arr2.stream()).sorted().toList();
		System.out.println("Cancatination of two Lists: "+arr3);
		System.out.println("---------------------------------");
		List<Integer> squaredList=arr3
				.stream()
				.map(n-> n*n)
				.toList();
		System.out.println("squaredList : "+squaredList);
		System.out.println("---------------------------------");
		
		List<String> names=new ArrayList<String>(Arrays.asList("Rajkumar","Shiva","Anil","Vishnu","Pavan","Ravi"));
		
		List<String> startsWithR=names.stream().filter(n-> n.startsWith("R")).toList();
		System.out.println("startsWithR : "+startsWithR);
		List<String> upperCase=names.stream().map(n-> n.toUpperCase()).toList();
		System.out.println("upperCase List : "+upperCase);
		List<String> lengthGreater5=names.stream().filter(n-> n.length() > 5).toList();
		System.out.println("length Greater Than 5 :"+lengthGreater5);
		
		System.out.println("---------------------------------");
		
		int evenSum=arr3.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		System.out.println(evenSum);
		System.out.println("---------------------------------");
		
		
		List<String> sortedByLength=names
				.stream()
				.sorted(Comparator.comparingInt(n-> n.length()))
				.toList();
		System.out.println("sortedByLength of String : "+sortedByLength);
		System.out.println("---------------------------------");
		
//		Set<Integer> duplicates=arr3.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry.);
//		System.out.println(duplicates);
		
		
		
		
		
	}
	
	

}
