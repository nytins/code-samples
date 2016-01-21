package com.nytins.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	
	private HelloWorld testObject = new HelloWorld();

	@Test
	public void testGetHelloMessage() {
		assertEquals("Hello", testObject.getHelloMessage());
	}
}
