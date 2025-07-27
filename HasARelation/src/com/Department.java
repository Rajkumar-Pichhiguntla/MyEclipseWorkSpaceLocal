package com;

public class Department {
	
	private String deptName;
	private int numberOfStu;
	private Professor professor;
	
	Department(){
		
	}
	
	
	public Department(String deptName, int numberOfStu, Professor professor) {
		this.deptName = deptName;
		this.numberOfStu = numberOfStu;
		this.professor = professor;
	}
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getNumberOfStu() {
		return numberOfStu;
	}
	public void setNumberOfStu(int numberOfStu) {
		this.numberOfStu = numberOfStu;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", numberOfStu=" + numberOfStu + ", professor=" + professor + "]";
	}
	

}
