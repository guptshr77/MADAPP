package com.fbla.student.controller;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fbla.student.bo.MessageBo;
import com.fbla.student.model.Message;

@RestController
public class MessageController {
	
	
	private static final String template = "%s, %s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private MessageBo messagebo;
	
	@GetMapping("/sendMessage")
	public String sendMessage(@RequestParam(value = "user_id", defaultValue = "null") int userid,
						@RequestParam(value = "recipient_user_id", defaultValue = "null") int recipeintUserId,
						@RequestParam(value = "subject", defaultValue = "null") String subject,
						@RequestParam(value = "msg_content", defaultValue = "null") String msgContent) {
	
		Message message = new Message(userid, recipeintUserId, subject, msgContent);
		
		return messagebo.sendMessage(message);
	}
	
	@GetMapping("/getMessage")
	public List<Message> getMessage(@RequestParam(value = "user_id", defaultValue = "null") int userId) {
		return messagebo.getMessages(userId);
	}

}
