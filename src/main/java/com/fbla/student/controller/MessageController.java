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
	
//taking input	
	private static final String template = "%s, %s, %s, %s";
	private final AtomicLong counter = new AtomicLong();
//wired to message business object	
	@Autowired
	private MessageBo messagebo;
//url extension to send a message	
	@GetMapping("/sendMessage")
	public String sendMessage(@RequestParam(value = "user_id", defaultValue = "null") String userid,
						@RequestParam(value = "recipient_id", defaultValue = "null") String recipeintId,
						@RequestParam(value = "subject", defaultValue = "null") String subject,
						@RequestParam(value = "msg_content", defaultValue = "null") String msgContent) {
	
		Message message = new Message(Integer.parseInt(userid),Integer.parseInt(recipeintId), subject, msgContent);
		
		return messagebo.sendMessage(message);
	}
//get messages of the user	 
	@GetMapping("/getMessage")
	public List<Message> getMessage(@RequestParam(value = "user_id", defaultValue = "null") int userId) {
		return messagebo.getMessages(userId);
	}
//get the messages the user has sent in the past	
	@GetMapping("/getSentMessages")
	public List<Message> getSentMessages(@RequestParam(value = "user_id", defaultValue = "null") int userId) {
		return messagebo.getSentMessages(userId);
	}

}
