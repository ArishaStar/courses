package com.intropro.blablacar;

public class Request {

	private Profile owner; 
	private String status;
	
	private Request() {
		
	}
	
	
	public static Request createRequest(Profile owner){
		Request request = new Request();
		request.setOwner(owner);
		request.setStatus("initial");
		return request;  	
	}
	
	//TODO 
	private void notifyRequest(){
		
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		Request other = (Request) obj;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}


	public Profile getOwner() {
		return owner;
	}

	public void setOwner(Profile owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
