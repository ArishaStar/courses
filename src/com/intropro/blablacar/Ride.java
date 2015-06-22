package com.intropro.blablacar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ride {
	
	private String start;
	private String finish;
	private Date date;
	private String status;
	private Profile owner;
	private List <Comment> comments = new ArrayList<Comment>();
	private List <Request> requests = new ArrayList<Request>();
	
	private Ride() {
		
	}
	
	public static Ride createRide(String start, String finish, Date date, Profile owner){
		
		Ride ride = new Ride();
		ride.setStart(start);
		ride.setFinish(finish);
		ride.setDate(date);
		ride.setOwner(owner);
		ride.setStatus("active");
		return ride;  
	}
	
	public Request createRequest(Profile owner){
		Request request = Request.createRequest(owner);
		if (requests.contains(request)) return null;
		requests.add(request);
		return request;
	}
	
	public void changeStatusRequest(Request request, boolean newStatus){
		status = (newStatus) ? "confirmed" : "denied";
		requests.get(requests.indexOf(request)).setStatus(status);
	}
	
	public void deleteRequest(Request request) {
		requests.remove(request);
	}
	
	public Comment createComment(Profile owner, String body) {
		Comment comment = Comment.createComment(owner, body);
		if (comments.contains(comment)) return null;
		comments.add(comment);
		return comment;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((finish == null) ? 0 : finish.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ride other = (Ride) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (finish == null) {
			if (other.finish != null)
				return false;
		} else if (!finish.equals(other.finish))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Profile getOwner() {
		return owner;
	}

	public void setOwner(Profile owner) {
		this.owner = owner;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	
	
	
	
	

}
