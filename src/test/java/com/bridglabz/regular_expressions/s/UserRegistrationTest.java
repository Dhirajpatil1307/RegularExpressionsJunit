package com.bridglabz.regular_expressions.s;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.regular_expressions.JUnitUserRegistration;

public class UserRegistrationTest {
	@Test
	public void check_Valid_Firstname() {
		UserRegistrationUsingJunit registration = new UserRegistrationUsingJunit();
		boolean check = registration.FirstEntity();
		assertTrue(check);
	}

	@Test
	public void LastName() {
		UserRegistrationUsingJunit registration = new UserRegistrationUsingJunit();
		boolean check = registration.LastEntity();
		assertTrue(check);
	}

	@Test
	public void Email() {
		UserRegistrationUsingJunit registration = new UserRegistrationUsingJunit();
		boolean check = registration.EmailVerification();
		assertTrue(check);
	}
}