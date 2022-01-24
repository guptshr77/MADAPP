package com.fbla.student.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.UserBo;
import com.fbla.student.model.Calendar;
import com.fbla.student.model.User;

@RestController
public class UserController {
	
	
	private static final String template = "%s, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private UserBo userbo;
	
	//@Autowired
	//private CalendarController calendar;

	@GetMapping("/login")
	public String login(@RequestParam(value = "username", defaultValue = "null") String username,
			@RequestParam(value = "password", defaultValue = "null") String password) {
		User user = new User(username, password);
		
		User ruser = userbo.login(user);
		if(ruser != null) {
			return  "Calendar goes here";
			//return calendar.calendar(user.getUserId());
		}else {
			return "Your username or password is incorrect. Please try again.";		
		}
}
	
}
