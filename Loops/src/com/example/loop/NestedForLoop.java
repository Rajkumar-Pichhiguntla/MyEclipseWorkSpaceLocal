package com.example.loop;

public class NestedForLoop {

	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++) {
//			System.out.println("i :"+i);
//			for(int j=1;j<=5;j++) {
//				System.out.println("j :"+j);
//			}
//		}
		
		
//		for(int i=5;i>=1;i--) {
//			
//			for(int j=5;j>=6-i;j--) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
