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
	
	
	private static final String template = "%s, %s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private SchoolClassBo schoolClassBo;
	
	@GetMapping("/addschedule")
	public String addSchedule(@RequestParam(value = "user_id", defaultValue = "null") int userId,
							@RequestParam(value = "class_id", defaultValue = "null") int classId) {
		return schoolClassBo.addClass(userId, classId);
	}
	
	@GetMapping("/getschedule")
	public List<SchoolClass> addSchedule(@RequestParam(value = "user_id", defaultValue = "null") int userId) {
		return schoolClassBo.getClasses(userId);
	}
	
	@GetMapping("/getallclasses")
	public List<SchoolClass> getAllClasses() {
		 return schoolClassBo.getAllClasses();
	}
	
//	@GetMapping("/classinput")
//	public void classInput(@RequestParam(value = "classname", defaultValue = "null") String className,
//			@RequestParam(value = "roomnum", defaultValue = "null") int roomNum,
//			@RequestParam(value = "starttime", defaultValue = "null")Time startTime,
//			@RequestParam(value = "endtime", defaultValue = "null")Time endTime) {
//		Class classobj = new Class(className, roomNum, startTime, endTime);
//		String message = classinputbo.addClass(classobj);
//	}
}
