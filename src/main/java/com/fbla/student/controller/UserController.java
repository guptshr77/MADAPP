package com.fbla.student.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.UserBo;
import com.fbla.student.model.Schedule;
import com.fbla.student.model.User;

@RestController
public class UserController {
	private static final String template = "%s, %s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/login")
	public Schedule getSchedule(@RequestParam(value = "username", defaultValue = "null") String username,@RequestParam(value = "password", defaultValue = "null") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		UserBo userbo = new UserBo();
		userbo.login(user);
		return new Schedule(counter.incrementAndGet(), String.format(username,password));
}
	
}
