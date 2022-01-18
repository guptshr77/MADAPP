package com.fbla.student.model;

import java.time.*;

public class Event {
	private String eventId;
	private LocalDateTime dateTime;
	private String description;
	private String color;
	private String title;
	
	public Event(String eventId, LocalDateTime dateTime, String description, String color, String title) {
		super();
		this.eventId = eventId;
		this.dateTime = dateTime;
		this.description = description;
		this.color = color;
		this.title = title;
	}
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
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
