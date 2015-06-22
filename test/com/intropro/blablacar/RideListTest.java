package com.intropro.blablacar;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class RideListTest {

	@Test
	public void testCreateRide() throws RideAlreadyExistsException {
		
		String start = "Cristal";
		String finish = "Grigorenko";
		String start2 = "Grigorenko";
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();

		Ride ride = rideList.createRide(start, finish, date, profile);
		
		assertNotNull(ride);
		assertTrue(!rideList.getRides().isEmpty());
		assertEquals(ride, rideList.getRides().get(0));
		
		Ride ride2 = rideList.createRide(start2, finish, date, profile);
		
		assertEquals(2, rideList.getRides().size());
		assertEquals(ride2, rideList.getRides().get(1));
		
		//assertNull(rideList.createRide(start2, finish, date, profile));

	}
	@Test
	public void testSearchRide() throws RideAlreadyExistsException {
		String start = "Cristal";
		String start2 = "Grigorenko";
		String finish = "Grigorenko";
		String finishNull = null;
		String startNull = null;
		String finishNotValid = "Cristal";
		String starthNotValid = "KPI";
		
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();

		Ride ride = rideList.createRide(start, finish, date, profile);
		Ride ride2 = rideList.createRide(start2, finish, date, profile);
		
		assertNotNull(rideList.search(start, finish));
		assertNotNull(rideList.search(start, finishNull));
		assertNull(rideList.search(start, finishNotValid));
		assertNotNull(rideList.search(startNull, finish));
		assertNull(rideList.search(startNull, finishNull));
		assertNull(rideList.search(startNull, finishNotValid));
		assertNull(rideList.search(starthNotValid, finish));
		assertNull(rideList.search(starthNotValid, finishNull));
		assertNull(rideList.search(starthNotValid, finishNotValid));
		
		ride.setStatus("full");
		assertNull(rideList.search(start, finish));
		
		
	}
	
	
	@Test
	public void testDeleteRide() throws RideAlreadyExistsException {
		String start = "Cristal";
		String finish = "Grigorenko";
		Date date = new Date();
		Profile profile = new Profile();
		RideList rideList = new RideList();
		Ride ride = rideList.createRide(start, finish, date, profile);
		
		rideList.deleteRide(ride);
		assertNull(rideList.search(start, finish));
	}

}
