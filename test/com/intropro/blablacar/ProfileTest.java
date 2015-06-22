package com.intropro.blablacar;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfileTest {
	
	
	@Test
	public void testCreatProfile() {
		String firstName = "firstName";
		String lastName = "lastName";
		String email = "email";
		String phone = "phone";
		
		Profile profile = new Profile();
		assertNotNull(profile);
		
		profile.setFirstName(firstName);
		profile.setLastName(lastName);
		profile.setEmail(email);
		profile.setPhone(phone);
		
		assertEquals(firstName, profile.getFirstName());
		assertEquals(lastName, profile.getLastName());
		assertEquals(email, profile.getEmail());
		assertEquals(phone, profile.getPhone());
		
	}

}
