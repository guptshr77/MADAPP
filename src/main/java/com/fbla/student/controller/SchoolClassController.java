package com.fbla.student.controller;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.SchoolClassBo;
import com.fbla.student.model.SchoolClass;

@RestController
public class SchoolClassController {
	
//taking input	
	private static final String template = "%s, %s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
//wired to school Class Business Object	
	@Autowired
	private SchoolClassBo schoolClassBo;
//when adding a class	
	@GetMapping("/addschedule")
	public String addSchedule(@RequestParam(value = "user_id", defaultValue = "null") int userId,
							@RequestParam(value = "class_id", defaultValue = "null") int classId) {
		return schoolClassBo.addClass(userId, classId);
	}
//get user schedule	
	@GetMapping("/getschedule")
	public List<SchoolClass> addSchedule(@RequestParam(value = "user_id", defaultValue = "null") int userId) {
		return schoolClassBo.getClasses(userId);
	}
//get all the classes offered	
	@GetMapping("/getallclasses")
	public List<SchoolClass> getAllClasses() {
		 return schoolClassBo.getAllClasses();
	}

}
