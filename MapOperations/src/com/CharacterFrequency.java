package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CharacterFrequency {
	
	public static void main(String[] args) {
		
		ArrayList<Character> characters=new ArrayList<>(Arrays.asList('A','B','A','C','a','A','B','b'));
//		characters.add('A');
//		characters.add('B');
//		characters.add('A');
//		characters.add('C');
//		characters.add('B');
//		characters.add('a');
//		characters.add('C');
//		characters.add('a');
//		characters.add('b');
//		characters.add('a');
		System.out.println(characters);
		
		//using Lists
		System.out.println("-----------Without Map---------------");
		List<Character> repeatedChar=new ArrayList<>();
		List<Integer> count=new ArrayList<>();
		
		for(Character character:characters) {
			if(repeatedChar.contains(character)) {
				int index=repeatedChar.indexOf(character);
				count.set(index, count.get(index)+1);
			}
			else {
				repeatedChar.add(character);
				count.add(1);
			}
		}
		System.out.println(repeatedChar+""+count);
		
		
		System.out.println("---------------Using Map-----------------");
		
		//Using Map
		
		Map<Character,Integer> countOfChar=new HashMap<>();
		
		for(Character character:characters) {
			if(countOfChar.containsKey(character)) {
				int value=countOfChar.get(character);
				countOfChar.put(character, value+1);
			}
			else {
				countOfChar.put(character, 1);
			}
		}
		System.out.println(countOfChar);
		for(Character key:countOfChar.keySet()){
			System.out.println(key+" - "+countOfChar.get(key));
		}
		
	}
}
