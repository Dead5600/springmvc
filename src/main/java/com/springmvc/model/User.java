package com.springmvc.model;

public class User {
	private String username;
	private String email;
	private String userpassword;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserpassword() {
		return userpassword;
	}
	
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", userpassword=" + userpassword + "]";
	}

	
	
	
}
