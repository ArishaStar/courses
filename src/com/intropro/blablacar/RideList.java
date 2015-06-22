package com.intropro.blablacar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

public class RideList {
 
	private List<Ride> rides = new ArrayList<Ride>();
	private static final Logger log = Logger.getLogger(RideList.class);

	
	public Ride createRide(String start, String finish, Date date, Profile owner) throws RideAlreadyExistsException{
		Ride ride = Ride.createRide(start, finish, date, owner);
		if (rides.contains(ride)) {
			log.info("error");
			Throwable t;
			log.info(message, t);
			throw new RideAlreadyExistsException("error");// return null;
		}
		rides.add(ride);
		return ride;
	}
	
	
	public Collection<Ride> search(String start, String finish){
		if (start == null && finish == null) {
			return null;
		}
		Collection<Ride> searchResult = new LinkedList<Ride>();
		
		for (Ride ride : rides) {
			if ("active".equals(ride.getStatus()) &&
					(start == null || ride.getStart().equals(start)) &&
					(finish == null || ride.getFinish().equals(finish))
					) {
				searchResult.add(ride);
			}
		}
		
		return searchResult.isEmpty() ? null : searchResult;
	}	
	
	public void deleteRide(Ride ride) {
		rides.remove(ride);
	}
	
	

	public List<Ride> getRides() {
		return rides;
	}

}
