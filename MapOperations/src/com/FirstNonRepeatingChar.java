package com;
import java.util.*;
public class FirstNonRepeatingChar {
	
	public static void main(String[] args) {
		FirstNonRepeatingChar.nonRepeatingChar("swisshgvnbhgcnvhvhgvhvmbhgvbvhg");
		
		
	}

	
	public static void nonRepeatingChar(String word) {
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:word.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		System.out.println(map);
		
//		for(int i=0;i<word.length();i++) {
//			if(map.containsKey(word.charAt(i))) {
//				
//				int count=map.get(word.charAt(i));
//				map.put(word.charAt(i), count+1);
//			}
//			else {
//				map.put(word.charAt(i), 1);
//			}
//		}
		for(Character key:map.keySet()) {
			if(map.get(key)==1) {
				System.out.println("First non Repeating character : "+key);
				break;
			}
		}
		
		
	}
}
