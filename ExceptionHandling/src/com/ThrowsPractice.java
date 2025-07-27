package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsPractice {
	
	public static void main(String[] args) throws FileNotFoundException {
		ThrowsPractice tp=new ThrowsPractice();
		try {
			tp.openFile();
		}
		catch(Exception e) {
			System.out.println("File Not Found");
		}
		
	}
	
	void openFile() throws FileNotFoundException {
		File file=new File("C:\\Users\\raj6g\\OneDrive\\Desktop\\hii.txt");
		FileInputStream fr=new FileInputStream(file);
	}

}
