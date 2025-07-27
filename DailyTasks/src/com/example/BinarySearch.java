package com.example;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int [] arr= {2,4,5,7,9,11,13,15,18,20};
		
		int target=20;
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				res=mid;
				break;
			}
			else if(arr[mid]<target) {
				start=mid+1;
				mid=(start+end)/2;
				
			}
			else {
				end=mid-1;
				mid=(start+end)/2;
			}
		}
		if(res==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("found at index :"+res);
		}
	}

}
