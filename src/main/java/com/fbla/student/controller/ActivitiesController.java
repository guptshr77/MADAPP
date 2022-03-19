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
	
	
	private static final String template = "%s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private CalendarBo calendarbo;
	
	
	@GetMapping("/getallactivities")
	public List<Extracurricular> getAllActivities() {
		return calendarbo.getAllActivities();
	}

	
	@GetMapping("/getuseractivity")
	public List<Extracurricular> getUserActivities(@RequestParam(value = "userid", defaultValue = "null") int userId) {
		return calendarbo.getActivities(userId);
	}
	
	@GetMapping("/addactivity")
	public String addSchedule(@RequestParam(value = "userid", defaultValue = "null") int userId,
							@RequestParam(value = "act_id", defaultValue = "null") int actId) {
		return calendarbo.addActivity(userId, actId);
	}
	
	
}
