package com.bridglabz.regular_expressions.s;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void check_Valid_Firstname() {
		UserRegistrationUsingJunit registration = new UserRegistrationUsingJunit();
		boolean check = registration.FirstEntity();
		assertTrue(check);
	}
}