package com.fbla.student.controller;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.CalendarBo;
import com.fbla.student.model.Calendar;
import com.fbla.student.model.User;

@RestController
public class CalendarController {
	
	@Autowired
	private static final String template = "%s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
	User user;
	CalendarBo calendarbo;
	
	@GetMapping("/calendar")
	public void calendar(@RequestParam(value = "userid", defaultValue = "null")int userid,
						@RequestParam(value = "date", defaultValue = "null")Date date,
						@RequestParam(value = "type", defaultValue = "monthly") String type) {
		user.setUserId(userid);
		List<Calendar> calendar = calendarbo.getCalendar(type, date, userid);
	}
}
