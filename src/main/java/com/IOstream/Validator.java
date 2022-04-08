package com.IOstream;

import java.util.regex.Pattern;

public class Validator {
	/*
	 * regex pattern for FirstName , LastName, address , city , Zip , email , phone
	 * number
	 */
	private String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
	private String addressPattern = "^[a-zA-Z0-9-, ]+";
	private String zipPattern = "^[0-9]{2,}";
	private String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
	private String phoneNumberPattern = "^[0-9]{1,}[ ][1-9][0-9]{9}$";

	/*
	 * create a method name as validateFirstName
	 * 
	 * @throws ContactRegistrationException
	 * @return true - pattern match with first name
	 */
	public boolean validateFirstName(String firstName) throws ContactRegistrationException {
		/*
		 * if regrex name patter match with first name then return true first name
		 */
		if (Pattern.matches(namePattern, firstName))
			return true;

		else
			throw new ContactRegistrationException("Invalid First Name, Please enter valid first name");
	}

	/*
	 * create a method name as validateLastName
	 * 
	 * @return true - pattern match with lastName
	 * @throws ContactRegistrationException
	 */
	public boolean validateLastName(String lastName) throws ContactRegistrationException {

		if (Pattern.matches(namePattern, lastName))
			return true;

		else
			throw new ContactRegistrationException("Invalid Last Name, Please enter valid last name");
	}

	/*
	 * create a method name as validateAddress
	 * 
	 * @return true - pattern match with address
	 * @throws ContactRegistrationException
	 */
	public boolean validateAddress(String address) throws ContactRegistrationException {
		/*
		 * if regrex address patter match with address then return true address
		 */
		if (Pattern.matches(addressPattern, address))
			return true;
		/*
		 * if they are not matched with address then throw error and display this msg
		 */
		else
			throw new ContactRegistrationException("Invalid Address, Please enter valid address");
	}

	/*
	 * create a method name as validateCity
	 * 
	 * @return true - pattern match with city name
	 * @throws ContactRegistrationException
	 */
	public boolean validateCity(String city) throws ContactRegistrationException {

		if (Pattern.matches(namePattern, city))
			return true;

		else
			throw new ContactRegistrationException("Invalid City, Please enter valid city");
	}

	/*
	 * create a method name as validateState
	 * 
	 * @return true - pattern match with state
	 * @throws ContactRegistrationException
	 */
	public boolean validateState(String state) throws ContactRegistrationException {

		if (Pattern.matches(namePattern, state))
			return true;

		else
			throw new ContactRegistrationException("Invalid State, Please enter valid state");
	}

	/*
	 * create a method name as validateZip
	 * 
	 * @return true - pattern match with zip
	 * @throws ContactRegistrationException
	 */
	public boolean validateZip(String zip) throws ContactRegistrationException {

		if (Pattern.matches(zipPattern, zip))
			return true;

		else
			throw new ContactRegistrationException("Invalid Zip, Please enter valid zip");
	}

	/*
	 * create a method name as validateEmailk
	 * 
	 * @return true - pattern match with emailID
	 * @throws ContactRegistrationException
	 */
	public boolean validateEmail(String email) throws ContactRegistrationException {

		if (Pattern.matches(emailPattern, email))
			return true;

		else
			throw new ContactRegistrationException("Invalid Email, Please enter valid email");
	}

	/*
	 * create a method name as validatePhoneNumber
	 * 
	 * @return true - pattern match with phoneNumber
	 * @throws ContactRegistrationException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws ContactRegistrationException {

		if (Pattern.matches(phoneNumberPattern, phoneNumber))
			return true;

		else
			throw new ContactRegistrationException("Invalid Phone Number, Please enter valid phone number");
	}
}
