package com.fbla.student.model;

import java.sql.Timestamp;
//school events
public class Event {
//components
	private int eventId;
	private Timestamp dateTime;
	private String description;
	private String color;
	private String title;
//constructors	
	public Event(int eventId, Timestamp dateTime, String description, String color, String title) {
		this.eventId = eventId;
		this.dateTime = dateTime;
		this.description = description;
		this.color = color;
		this.title = title;
	}
	public Event(int eventId, Timestamp dateTime, String title, String description) {
		this.eventId = eventId;
		this.dateTime = dateTime;
		this.title = title;
		this.description = description;
	}
//getters and setters
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime(Timestamp dateTime) {
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
