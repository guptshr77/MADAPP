package com.fbla.student.model;

import java.sql.Date;

public class Event {
	private int eventId;
	private Date dateTime;
	private String description;
	private String color;
	private String title;
	
	public Event(int eventId, Date dateTime, String description, String color, String title) {
		this.eventId = eventId;
		this.dateTime = dateTime;
		this.description = description;
		this.color = color;
		this.title = title;
	}
	
	

	public Event(int eventId, Date dateTime, String title, String description) {
		this.eventId = eventId;
		this.dateTime = dateTime;
		this.title = title;
		this.description = description;
	}



	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	
}
