package com.fbla.student.model;

import com.fbla.student.model.User;

//bug model
public class Bug {

//components
	private int bugId;
	private int userId;
	private String message;
	
//constructors
	public Bug(int userId, String message) {
		this.userId = userId;
		this.message = message;
	}
	
//getters setters
	public int getBugId() {
		return bugId;
	}
	public void setBugId(int bugId) {
		this.bugId = bugId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
