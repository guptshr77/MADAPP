package com.fbla.student.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {
	
	@Autowired
	private static final String template = "%s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/calendar")
	public void calendar(@RequestParam(value = "type", defaultValue = "monthly") String type) {
		
	}
}
