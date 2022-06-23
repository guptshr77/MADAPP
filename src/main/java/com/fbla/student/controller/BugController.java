package com.fbla.student.controller;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.BugBo;
import com.fbla.student.model.Bug;

@RestController
public class BugController {

//taking input
	private static final String template = "%s, %s";
	private final AtomicLong counter = new AtomicLong();
//wired to bug business object
	@Autowired
	private BugBo bugbo;
//url extension to send a message
	@GetMapping("/bugReport")
	public String reportBug(@RequestParam(value = "user_id") String userid,
							@RequestParam(value = "bug") String message) {
		Bug bug = new Bug(Integer.parseInt(userid), message);
		
		return bugbo.reportBug(bug);
	}
}
