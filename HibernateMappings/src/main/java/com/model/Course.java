package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Courses")
public class Course {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	private String courseName;
	private long NoOfStudents;
	
	@ManyToMany(mappedBy="course",cascade=CascadeType.ALL)
	private List<Student> students;
	
	public Course(int courseId, String courseName, long count) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.NoOfStudents = count;
	}
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
		
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getNoOfStudents() {
		return NoOfStudents;
	}

	public void setNoOfStudents(long noOfStudents) {
		NoOfStudents = noOfStudents;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", countName=" + courseName + ", NoOfStudents=" + NoOfStudents + "]";
	}
	
	
	
	
}
