package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class HashMapOperations {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		
		
		map.put("Social", 90);
		map.put("Telugu", 99);
		map.put("English", 90);//allows heterogeneous Data
		map.put("English", 95);
		map.put("english", 90);
		map.put("englishss", 90);
		map.put("english", 96);
		map.put(null, null);
		map.put(null, null);
		System.out.println(map);
		System.out.println("------------------------------------");
		TreeMap<String,Integer> treeMap=new TreeMap<String,Integer>();
		treeMap.put("Social", 90);
		treeMap.put("Telugu", 99);
		treeMap.put("English", 90);//allows heterogeneous Data
		treeMap.put("English", 95);
		treeMap.put("english", 90);
		treeMap.put("englishss", 90);
		treeMap.put("english", 96);
		treeMap.put("Hello", null);
//		treeMap.put(null, 90);//Null not Accepted in Treemap
		System.out.println(treeMap);
		System.out.println("------------------------------------");
		LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<String,Integer>();
		linkedHashMap.put("Social", 90);
		linkedHashMap.put("Telugu", 99);
		linkedHashMap.put("English", 90);//allows heterogeneous Data
		linkedHashMap.put("English", 95);
		linkedHashMap.put("english", 90);
		linkedHashMap.put("englishss", 90);
		linkedHashMap.put("english", 96);
		linkedHashMap.put("Hello", null);
		linkedHashMap.put(null, 90);
		
		System.out.println(linkedHashMap.get("Social"));//To Get Single value Using key
		
		for(Map.Entry<String, Integer> entry:linkedHashMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+linkedHashMap.get(entry.getKey()));
		}
		
		Set<String> keySet=linkedHashMap.keySet();
		System.out.println(keySet);
		System.out.println(linkedHashMap.values());
		System.out.println("------------------------------------");
		System.out.println(linkedHashMap);
		
		
		System.out.println("------------------------------------");
		
		
		
		Driver d1=new Driver(1,"AAA");
		Driver d2=new Driver(2,"AAA");
		Driver d3=new Driver(3,"CCC");
		Driver d4=new Driver(1,"AAA");
//		HashMap<Integer,Driver> driver=new HashMap<>();
		HashMap<Driver,Integer> driver=new HashMap<>();
		driver.put(d1, d1.id);
		driver.put(d2, d2.id);
		driver.put(d3, d3.id);
		driver.put(d4, d4.id);
		for(Entry<Driver, Integer> entry : driver.entrySet()) {
			System.out.println(entry);
		}
	}
}

class Driver{
	int id;
	String name;
	public Driver(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}
