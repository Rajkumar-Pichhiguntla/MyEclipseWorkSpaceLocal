package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pass_id")
	private Passport passport;
	public User() {
		
	}
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	
	public User(String userName, Passport passport) {
		super();
		this.userName = userName;
		this.passport = passport;
	}
	public User(String username) {
		this.userName=username;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passport=" + passport + "]";
	}
	
	
}
