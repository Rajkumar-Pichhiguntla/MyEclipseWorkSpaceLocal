package com.optional;

public class User {
	int userId;
	String email;
	public User(int userId, String email) {
		super();
		this.userId = userId;
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + "]";
	}
	
	public String getUserEmailById(int id) {
		return this.email;
	}
	

}
