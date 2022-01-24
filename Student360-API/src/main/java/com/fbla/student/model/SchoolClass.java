package com.fbla.student.model;

import java.sql.Time;

public class SchoolClass {

	private int classId;
	private String classname;
	private int roomnum;
	private Time startTime;
	private Time endTime;
	
	public SchoolClass(int classId, String classname, int roomnum, Time startTime, Time endTime) {
		this.classId = classId;
		this.classname = classname;
		this.roomnum = roomnum;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public SchoolClass(int classId, String classname) {
		this.classId = classId;
		this.classname = classname;
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
}
