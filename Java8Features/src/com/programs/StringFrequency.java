package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
	public static void main(String[] args) {
		
		List<String> fruits=new ArrayList<>(Arrays.asList("apple","banana","apple","banana","guava"));
		
		Map<String,Long> frequency=fruits
			.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Frequency of Strings : "+frequency);
		
		String fruit="Apple";
		
		Map<Object, Long> charfrequency= fruit.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(charfrequency);
	}

}
