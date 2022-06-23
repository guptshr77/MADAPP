package com.fbla.student.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.CalendarBo;
import com.fbla.student.model.Calendar;
import com.fbla.student.model.Extracurricular;
import com.fbla.student.model.User;

@RestController
public class ActivitiesController {
	
//taking input	
	private static final String template = "%s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
//wired to calendar Business Object	
	@Autowired
	private CalendarBo calendarbo;
	
//url extension to get all the extracurricular activities offered	
	@GetMapping("/getallactivities")
	public List<Extracurricular> getAllActivities() {
		return calendarbo.getAllActivities();
	}

//url extension to get activities the user is a part of 	
	@GetMapping("/getuseractivity")
	public List<Extracurricular> getUserActivities(@RequestParam(value = "userid", defaultValue = "null") int userId) {
		return calendarbo.getActivities(userId);
	}
//url extension to add an acitivity to a user	
	@GetMapping("/addactivity")
	public String addSchedule(@RequestParam(value = "userid", defaultValue = "null") int userId,
							@RequestParam(value = "act_id", defaultValue = "null") int actId) {
		return calendarbo.addActivity(userId, actId);
	}
	
	
}
