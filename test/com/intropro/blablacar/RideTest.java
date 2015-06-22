package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class RideTest {

	
	@Test
	public void testCreateRequest() {
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();
		Ride ride = rideList.createRide(start, finish, date, profile);
		
		Profile owner = new Profile();
		owner.setFirstName("firstName");
		owner.setLastName("lastName");
		owner.setEmail("email");
		owner.setPhone("phone");
		
		Request request = ride.createRequest(owner);
		
		assertNotNull(request);
		assertTrue(!ride.getRequests().isEmpty());
		assertEquals(request, ride.getRequests().get(0));
		
		Profile owner2 = new Profile();
		owner.setFirstName("firstName2");
		owner.setLastName("lastName2");
		owner.setEmail("email2");
		owner.setPhone("phone2");
		
		Request request2 = ride.createRequest(owner2);
		assertEquals(2, ride.getRequests().size());
		assertEquals(request2, ride.getRequests().get(1));
		
		assertNull(ride.createRequest(owner));
	}
	
	@Test
	public void testDeleteRequest() {
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();
		Ride ride = rideList.createRide(start, finish, date, profile);
		
		Profile owner = new Profile();
		owner.setFirstName("firstName");
		owner.setLastName("lastName");
		owner.setEmail("email");
		owner.setPhone("phone");
		
		Request request = ride.createRequest(owner);
		
		ride.deleteRequest(request);
		assertEquals(0, ride.getRequests().size());
	}
	
	@Test
	public void testChangeStatusRequest() {
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();
		Ride ride = rideList.createRide(start, finish, date, profile);
		
		Profile owner = new Profile();
		owner.setFirstName("firstName");
		owner.setLastName("lastName");
		owner.setEmail("email");
		owner.setPhone("phone");
		
		Request request = ride.createRequest(owner);
		Boolean newStatusT = true;
		ride.changeStatusRequest(request, newStatusT);
		assertEquals("confirmed", request.getStatus());
		Boolean newStatusF = false;
		ride.changeStatusRequest(request, newStatusF);
		assertEquals("denied", request.getStatus());

	}
	
	@Test
	public void testCreateComment() {
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();
		Ride ride = rideList.createRide(start, finish, date, profile);
		
		Profile owner = new Profile();
		owner.setFirstName("firstName");
		owner.setLastName("lastName");
		owner.setEmail("email");
		owner.setPhone("phone");
		
		String body = "comment";
		Comment comment = ride.createComment(owner, body);
		
		assertNotNull(comment);
		assertTrue(!ride.getComments().isEmpty());
		assertEquals(comment, ride.getComments().get(0));
		
		Profile owner2 = new Profile();
		owner.setFirstName("firstName2");
		owner.setLastName("lastName2");
		owner.setEmail("email2");
		owner.setPhone("phone2");
		
		Comment comment2 = ride.createComment(owner2, body);
		assertEquals(2, ride.getComments().size());
		assertEquals(comment2, ride.getComments().get(1));
		
		assertNotNull(ride.createComment(owner, body));
		assertNotEquals(ride.createComment(owner, body), ride.createComment(owner, body));
		
		assertEquals(5,ride.getComments().size());
	}

}
