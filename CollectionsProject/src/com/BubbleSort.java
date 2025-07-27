package com;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,7,19,2,20,5));
		System.out.println(list);
		for(int i=0;i<list.size()-1;i++) {
			for(int j=0;j<list.size()-i-1;j++) {
				if(list.get(j)> list.get(j+1)) {
				int temp=list.get(j);
				list.set(j,list.get(j+1));
				list.set(j+1, temp);
				}
			}
		}
		System.out.println(list);
	}
	
}
