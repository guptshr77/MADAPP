package com.fbla.student.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.model.Schedule;

@RestController
public class StudentController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/schedule")
	public Schedule getSchedule(@RequestParam(value = "scheduleName", defaultValue = "English") String scheduleName) {
		return new Schedule(counter.incrementAndGet(), String.format(template, scheduleName));
	}
}
