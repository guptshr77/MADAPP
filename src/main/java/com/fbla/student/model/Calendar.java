package com.fbla.student.model;

import java.util.List;
import com.fbla.student.model.SchoolClass;
import com.fbla.student.model.Event;
import com.fbla.student.model.Extracurricular;

public class Calendar {

	private List<SchoolClass> classes;
	private List<Event> events;
	private List<Extracurricular> extracurriculars;
	
	public Calendar(List<SchoolClass> classes, List<Event> events, List<Extracurricular> extracurriculars) {
		this.classes = classes;
		this.events = events;
		this.extracurriculars = extracurriculars;
	}
	
	public List<SchoolClass> getClasses() {
		return classes;
	}
	public void setClasses(List<SchoolClass> classes) {
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
	public void setExtracurriculars(List<Extracurricular> extracurriculars) {
		this.extracurriculars = extracurriculars;
	}
	
	
	
}
