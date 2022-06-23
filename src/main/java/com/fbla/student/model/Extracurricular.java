package com.fbla.student.model;

import java.sql.Date;
import java.sql.Time;
//extracurricular activities model
public class Extracurricular {
//components
	private int actId;
	private String title;
	private String location;
	private String descr;
	private Time startTime;
	private Time endTime;
	private Date date;
	private int teacherId;
	private int meetingId;
	private String color;
//constructors	
	public Extracurricular(int actId, String title) {
		super();
		this.actId = actId;
		this.title = title;
	}
	
	public Extracurricular (int actId, String title, String descr, int teacherId) {
		this.actId = actId;
		this.title = title;
		this.descr = descr;
		this.teacherId = teacherId; 
	}
	
	public Extracurricular(int meetingId, int actId, String title, String descr, int teacherId, String location, Time startTime, Time endTime, Date date, String color) {
		this.meetingId = meetingId;
		this.actId = actId;
		this.title = title;
		this.descr = descr;
		this.teacherId = teacherId;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
		this.color = color;
	}
//getters and setters	
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
