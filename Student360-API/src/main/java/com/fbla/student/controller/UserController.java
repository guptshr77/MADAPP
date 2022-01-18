package com.fbla.student.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.UserBo;
import com.fbla.student.model.Schedule;
import com.fbla.student.model.User;

@RestController
public class UserController {
	
	@Autowired
	private static final String template = "%s, %s";
	private final AtomicLong counter = new AtomicLong();
	private UserBo userbo;

	@GetMapping("/login")
	public void login(@RequestParam(value = "username", defaultValue = "null") String username,
			@RequestParam(value = "password", defaultValue = "null") String password) {
		User user = new User(username, password);
		
		List<User> userList = userbo.login(user);
		if(user != null) {
			//Yay they logged in
		}else {
			//send message
		}
}
	
}
