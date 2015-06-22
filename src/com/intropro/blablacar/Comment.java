package com.intropro.blablacar;

import java.util.Date;

public class Comment {
	
	private Profile owner;
	private String body;
	private Date date;
	
	private Comment() {
	}
	
	public static Comment createComment(Profile owner, String body) {
		Comment comment = new Comment();
		comment.setOwner(owner);
		comment.setBody(body);
		comment.setDate(new Date());
		return comment;
	}

	public Profile getOwner() {
		return owner;
	}

	public void setOwner(Profile owner) {
		this.owner = owner;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
	
