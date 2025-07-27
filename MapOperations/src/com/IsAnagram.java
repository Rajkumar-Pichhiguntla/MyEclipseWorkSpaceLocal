package com;
import java.util.*;
public class IsAnagram {
	public static void main(String[] args) {
		boolean result=IsAnagram.isAnagram("liste", "silent");
		System.out.println(result);
	}
	
	public static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		//count of str1
		for(char ch:str1.toCharArray()) {
			map.putIfAbsent(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char ch:str2.toCharArray()) {
			if(!map.containsKey(ch)) {
				return false;
			}
			map.put(ch, map.get(ch)-1);
			if(map.get(ch)<0) return false;
		}
		
		for(int count:map.values()) {
			if(count!=0) {
				return false;
			}
		}
		return true;
	}
	

}
