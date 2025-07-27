package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
//@NamedQuery(name = "insertData", query = "insert into Student(stu_name,stu_marks) values(?1,?2)")
@NamedQueries(value = { @NamedQuery(name = "allStudents", query = "from Student") ,@NamedQuery(name = "insertData", query = "insert into Student(stu_name,stu_marks) values(?1,?2)"),@NamedQuery(name="updateData",query="update Student set stu_marks=?1 where stu_id=?2"),@NamedQuery(name = "deleteData", query = "delete from Student where stu_id=?1"),})
public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stu_id;
	@Column(name="name")
	private String stu_name;
	@Column(name="marks")
	private int stu_marks;
	
	public Student() {
		
	}
	public Student(int stu_id, String stu_name, int stu_marks) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_marks = stu_marks;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStu_marks() {
		return stu_marks;
	}
	public void setStu_marks(int stu_marks) {
		this.stu_marks = stu_marks;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_marks=" + stu_marks + "]";
	}
	
	

}
