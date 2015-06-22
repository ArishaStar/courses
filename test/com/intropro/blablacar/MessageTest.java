package com.intropro.blablacar;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class MessageTest {
	
	@Test
	public void testSendMessage() {
		Profile from  = new Profile(); 
		Profile to = new Profile(); 
		String body = "comment";
		Message message = new Message();
		message.sendMessage(message, from, to, body);
		
		assertNotNull(message);
	}
	
	@Test
	public void testViewMessage() {
		Profile from  = new Profile(); 
		Profile to = new Profile(); 
		String body = "comment";
		Message message = new Message();
		message.sendMessage(message, from, to, body);

		assertNotNull(message.getBody());
		assertNotNull(message.getDate());
		assertNotNull(message.getFrom());
		assertNotNull(message.getTo());
	}
}
