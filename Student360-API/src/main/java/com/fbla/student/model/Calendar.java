package com.fbla.student.model;

import java.util.List;

public class Calendar {

	private List<Class> classes;
	private List<Event> events;
	private List<Extracurricular> extracurriculars;
	
//	public Calendar(List<Class> classes, List<Event> events, List<Extracurricualr> extracurriculars) {
//		super();
//		this.classes = classes;
//		this.events = events;
//		this.extracurriculars = extracurriculars;
//	}
	
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public List<Extracurricular> getExtracurriculars() {
		return extracurriculars;
	}
//	public void setExtracurriculars(List<Extracurricualr> extracurriculars) {
//		this.extracurriculars = extracurriculars;
//	}
	
	
	
}
