package com.example;
import java.util.*;
public class DuplicateCharacter {

	public static void main(String[] args) {
		findDuplicateChar("rajkumar");
	}
	
	public static void findDuplicateChar(String str) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" - "+entry.getValue());
			}
		}
		
		
		
	}
}
