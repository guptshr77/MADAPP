package com.fbla.student.model;

import java.time.*;

public class Class {
	private int classId;
	private String classname;
	private int roomnum;
	private LocalTime startTime;
	private LocalTime endTime;
	private String color;
	
	public Class(int classId, String classname, int roomnum, LocalTime startTime, LocalTime endTime, String color) {
		this.classId = classId;
		this.classname = classname;
		this.roomnum = roomnum;
		this.startTime = startTime;
		this.endTime = endTime;
		this.color = color;
	}
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(int roomnum) {
		this.roomnum = roomnum;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}
