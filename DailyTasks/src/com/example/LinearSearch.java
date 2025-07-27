package com.example;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		
		int target=5;
		int res=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				
				res=i;
				break;
			}
		}
		if(res==-1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found "+target+" at Index   "+res);
		}
	}

}
