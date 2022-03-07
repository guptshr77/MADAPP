package com.fbla.student.model;

import java.sql.Date;
import java.sql.Time;

public class Extracurricular {
	private int actId;
	private String title;
	private String location;
	private String descr;
	private Time startTime;
	private Time endTime;
	private Date date;
	private int teacherId;
	
	public Extracurricular(int actId, String title) {
		super();
		this.actId = actId;
		this.title = title;
	}

	public Extracurricular(int actId, String title, String location, String descr, Time startTime, Time endTime, Date date) {
		this.actId = actId;
		this.title = title;
		this.location = location;
		this.descr = descr;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}
	
	public Extracurricular (int actId, String title, String descr, int teacherId) {
		this.actId = actId;
		this.title = title;
		this.descr = descr;
		this.teacherId = teacherId; 
	}
	
	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
