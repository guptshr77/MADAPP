package com.fbla.student.model;

public class Schedule {
	private long scheduleId;
	private String scheduleName;
	
	public Schedule(long scheduleId, String scheduleName) {
		this.scheduleId = scheduleId;
		this.scheduleName = scheduleName;
	}
	public long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	
	
}
