package com.fbla.student.model;

public class Message {
	private int msgId;
	private int recipientUserId;
	private String subject;
	private String msgContent;
	
	public Message(int msgId, int recipientUserId, String subject, String msgContent) {
		this.msgId = msgId;
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
	
}
