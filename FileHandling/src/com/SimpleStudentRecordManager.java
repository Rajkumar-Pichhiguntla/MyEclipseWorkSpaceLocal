package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleStudentRecordManager {
	
	static final String FILE_NAME="Student.txt";
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("------Student Record Manager--------");
			System.out.println("1.Add Student");
			System.out.println("2.View All Students");
			System.out.println("3.Search Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");
			System.out.println("Enter Your Choice : ");
			
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				addStudent(sc);
				break;
			case 2:
				viewStudents();
				break;
			case 3:
				searchStudent(sc);
				break;
			case 4:
				deleteStudent(sc);
				break;
			case 5:
				System.out.println("Exiting..");
				break;
				
			default:
				System.out.println("Invalid Choice");	
			}	
		}
		while(choice!=5);
	}
	
	
	static void addStudent(Scanner sc)  {
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(FILE_NAME,true))) {
			System.out.println("Enter student Details:");
			System.out.println("Enter Roll Number:");
			int rollNumber=sc.nextInt();
			System.out.println("Enter name:");
			String studentName=sc.next();
			System.out.println("Enter marks:");
			int marks=sc.nextInt();
			
			bw.write(rollNumber+","+studentName+","+marks);
			bw.newLine();
			System.out.println("Student added Successfully !!");
			
		}
		catch(IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void viewStudents() {
		
		try(BufferedReader br=new BufferedReader(new FileReader(FILE_NAME))){
			String line;
			System.out.println("---Students List----");
			while((line=br.readLine())!=null) {
				String[] data=line.split(",");
				System.out.println("Roll No:"+data[0]+", Name :"+data[1]+", Marks:"+data[2]);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("No Records Found");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	static void searchStudent(Scanner sc) {
		System.out.println("Enter Roll No to Search :");
		String rollNumber=sc.next();
		boolean found=false;
		try(BufferedReader br=new BufferedReader(new FileReader(FILE_NAME))){
			String line;
			while((line=br.readLine())!=null) {
				String[] data=line.split(",");
				if(data[0].equals(rollNumber)) {
					System.out.println("Student Found - Roll No:"+data[0]+", Name :"+data[1]+", Marks:"+data[2]);
				}
				found=true;
				break;
			}
			
			if(!found) {
				System.out.println("Student with "+rollNumber+" Not Found!!");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("No File Found");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void deleteStudent(Scanner sc) {
		System.out.println("Enter Roll No to Delete :");
		String rollNumber=sc.next();
		boolean Deleted=false;
		
		File originalFile=new File(FILE_NAME);
		File tempFile=new File("temp.txt");
		try(BufferedReader br=new BufferedReader(new FileReader(originalFile));
				BufferedWriter bw=new BufferedWriter(new FileWriter(tempFile))){
			String line;
			while((line=br.readLine())!=null) {
				String[] data=line.split(",");
				if(data[0].equals(rollNumber)) {
					Deleted=true;
					continue;
				}
				bw.write(line);
				bw.newLine();
			}
			
			if(Deleted) {
				System.out.println("Student Deleted..");
			}
			else {
				System.out.println("RollNo Not Found");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		if(originalFile.delete()) {
			tempFile.renameTo(originalFile);
		}
		
	}
}
