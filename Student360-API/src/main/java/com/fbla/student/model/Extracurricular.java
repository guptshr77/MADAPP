package com.fbla.student.model;

public class Extracurricular {
	private int actId;
	private String title;
	private String location;
	private String descr;
	
	public Extracurricular(int actId, String title, String location, String descr) {
		this.actId = actId;
		this.title = title;
		this.location = location;
		this.descr = descr;
	}	
	
	public int getActId() {
		return actId;
	}
	public void setActId(int actId) {
		this.actId = actId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}

}
