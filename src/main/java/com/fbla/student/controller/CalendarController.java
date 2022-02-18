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
public class CalendarController {
	
	
	private static final String template = "%s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private CalendarBo calendarbo;
	
	
	@GetMapping("/calendar")
	public Calendar calendar(@RequestParam(value = "userid", defaultValue = "null")int userid,
						@RequestParam(value = "date", defaultValue = "null" ) String cdate,
						@RequestParam(value = "type", defaultValue = "daily") String type) {	
		if (!cdate.equals("null")) 
			return calendarbo.getCalendar(type, Date.valueOf(cdate), userid);
		else
			return calendarbo.getCalendar(type, (new Date(System.currentTimeMillis())), userid);
	}
	
	@GetMapping("/getallactivities")
	public List<Extracurricular> getAllActivities() {
		return calendarbo.getAllActivities();
	}
	
	@GetMapping("/addactivity")
	public String addSchedule(@RequestParam(value = "user_id", defaultValue = "null") int userId,
							@RequestParam(value = "act_id", defaultValue = "null") int actId) {
		return calendarbo.addActivity(userId, actId);
	}
	
	
}
