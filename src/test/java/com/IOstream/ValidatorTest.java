package com.IOstream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidatorTest {
	@Test
	public void testValidateFirstName() {
		try {
			Validator obj = new Validator();
			String firstName = "Shree";
			assertEquals(true, obj.validateFirstName(firstName));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateLastName() {
		try {
			Validator obj = new Validator();
			String lastName = "Pachpor";
			assertEquals(true, obj.validateLastName(lastName));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateAddress() {
		try {
			Validator obj = new Validator();
			String address = "Nagar";
			assertEquals(true, obj.validateAddress(address));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateCity() {
		try {
			Validator obj = new Validator();
			String city = "Bengaluru";
			assertEquals(true, obj.validateCity(city));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateState() {
		try {
			Validator obj = new Validator();
			String state = "Karnataka";
			assertEquals(true, obj.validateState(state));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateZip() {
		try {
			Validator obj = new Validator();
			String zip = "414002";
			assertEquals(true, obj.validateZip(zip));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidateEmail() {
		try {
			Validator obj = new Validator();
			String email = "Sp@gmail.com";
			assertEquals(true, obj.validateEmail(email));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testValidatePhoneNumber() {
		try {
			Validator obj = new Validator();
			String phoneNumber = "91 9988447744";
			assertEquals(true, obj.validatePhoneNumber(phoneNumber));
		} catch (ContactRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

}
