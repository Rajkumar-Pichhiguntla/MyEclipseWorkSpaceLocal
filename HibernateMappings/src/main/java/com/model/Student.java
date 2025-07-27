package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stuId;
	private String stuName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Student_Courses",
	joinColumns = { @JoinColumn(name="stuId")},
	inverseJoinColumns= {@JoinColumn(name="courseId")})
	private List<Course> course;
	
	
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	public Student(String stuName) {
		this.stuName=stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	
	
	
}
