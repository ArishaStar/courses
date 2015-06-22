package com.intropro.blablacar;

import java.util.Date;

public class Message {
	
	private Profile from;
	private Profile to;
	private Date date;
	private String body;

	
	public Message sendMessage(Message message, Profile from, Profile to, String body) {
		message.setFrom(from);
		message.setTo(to);
		message.setDate(new Date());
		message.setBody(body);
		return message;
	}
	
//TODO 
	public void notyfyRecivier() {
		
	}

	public Profile getFrom() {
		return from;
	}

	public void setFrom(Profile from) {
		this.from = from;
	}

	public Profile getTo() {
		return to;
	}

	public void setTo(Profile to) {
		this.to = to;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
