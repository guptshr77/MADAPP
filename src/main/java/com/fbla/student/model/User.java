package com.fbla.student.model;

public class User {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private int userId;
	
	public User () {
		
	}
	public User(int userId, String firstname, String lastname) {
		this.userId = userId;
		this.firstName = firstname;
		this.lastName = lastname;
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User(int userId, String firstName, String lastName, String username) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
