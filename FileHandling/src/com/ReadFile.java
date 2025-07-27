package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		
		ReadFile rf=new ReadFile();
		rf.readFile();
//		rf.writeFile();
	}

	
	public void readFile() throws IOException {
		File file=new File("C:\\Users\\raj6g\\OneDrive\\Desktop\\hi.txt");
		FileReader fr=null;
		try {
			fr=new FileReader(file);
			
				int temp;
				while((temp=fr.read())!=-1) {
					System.out.print(temp);
				}
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
//	public void writeFile() throws IOException {
//		File file=new File("C:\\Users\\raj6g\\OneDrive\\Desktop\\hi.txt");
//		FileReader fr=null;
//		File file2=new File("C:\\Users\\raj6g\\OneDrive\\Desktop\\hello.txt");
//		FileWriter fw=null;
//		
//		try {
//			fr=new FileReader(file);
//			fw=new FileWriter(file2);
//				int temp;
//				while((temp=fr.read())!=-1) {
//					fw.write(temp);
//				}
//		
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if(fr!=null) {
//				fr.close();
//			}
//			if(fw!=null) {
//				fw.close();
//			}
//		}
//	}
}
