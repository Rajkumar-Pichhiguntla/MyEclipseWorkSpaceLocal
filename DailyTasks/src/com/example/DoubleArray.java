package com.example;

public class DoubleArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3};
		int n=arr.length;
		
		int[] arr1=new int[n*2];
		
		for(int i=0;i<n;i++) {
			arr1[i]=arr[i];
			arr1[n+i]=arr[i];
		}
		for(int x:arr1) {
			System.out.println(x);
		}
	}

}
