package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\raj6g\\OneDrive\\Desktop\\Test.txt");
		file.createNewFile();
		
		//Writing to File
		
		FileWriter fw=new FileWriter("C:\\Users\\raj6g\\OneDrive\\Desktop\\Test.txt");
		fw.write("Hello Im Rajkumar");
		fw.close(); //We have to close the file then only full data writes into file,otherwise we may loose some data 
		
		
	}

}
