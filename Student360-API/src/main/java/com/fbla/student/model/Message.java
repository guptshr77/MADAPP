package com.fbla.student.model;

import java.sql.Date;

import com.fbla.student.model.User;

public class Message {
	private int msgId;
	private int userId;
	private int recipientUserId;
	private String subject;
	private String msgContent;
	private User user;
	private Date datetime; 
	
	public Message(int msgId,int userId ,int recipientUserId, String subject, String msgContent) {
		this.msgId = msgId;
		this.userId = userId;
		this.recipientUserId = recipientUserId;
		this.subject = subject;
		this.msgContent = msgContent;

	}
	
	public Message(User user, String subject, String msgContent, int msgId, Date datetime) {
		this.setUser(user);
		this.subject = subject;
		this.msgContent = msgContent;
		this.msgId = msgId;
		this.datetime = datetime;
	}
	
	public Message(int userId, int recipientUserId, String subject, String msgContent) {
		this.userId = userId;
		this.recipientUserId = recipientUserId;
		this.subject = subject;
		this.msgContent = msgContent;
	}


	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRecipientUserId() {
		return recipientUserId;
	}
	public void setRecipientUserId(int recipientUserId) {
		this.recipientUserId = recipientUserId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}
