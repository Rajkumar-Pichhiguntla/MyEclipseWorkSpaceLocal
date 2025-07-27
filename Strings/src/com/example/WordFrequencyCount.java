package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordFrequencyCount {
	
	public static void main(String[] args) {
		String sentance="Hello World Hello Java world";
		
		sentance=sentance.toLowerCase();
		
		String[] words=sentance.split(" ");
		
//		for(String word:words) {
//			System.out.println(word);
//		}
		
		System.out.println(Arrays.toString(words));
		
		
		
		List<String> uniqueWords=new ArrayList<String>();
		List<Integer> countOfWords=new ArrayList<Integer>();
		
		for(String word:words) {
			if(uniqueWords.contains(word)) {
				int index=uniqueWords.indexOf(word);
				countOfWords.set(index, countOfWords.get(index)+1);
			}
			else {
				uniqueWords.add(word);
				countOfWords.add(1);
			}
		}
		
		System.out.println(uniqueWords);
		System.out.println(countOfWords);
	}
	

}
