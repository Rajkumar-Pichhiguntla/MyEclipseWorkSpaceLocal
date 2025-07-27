package com.example;

public class PrintingT {
	public static void main(String[] args) {
		PrintingT.printLetterT();
	}
	
	static void printLetterT() {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==n/2) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
