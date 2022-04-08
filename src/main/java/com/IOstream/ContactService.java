package com.IOstream;

import java.util.Scanner;

public class ContactService {
	Scanner sc;
	private Validator validator;

	/*
	 * create a parameterized constructor name as ContactService
	 */

	public ContactService(Scanner sc) {

		this.sc = sc;
		this.validator = new Validator();
	}

	public ContactPerson createContact() {
		ContactPerson contact = new ContactPerson();
		/*
		 * variables in all string data type
		 */
		String firstName, lastName, address, city, state, zip, email, phoneNumber;
		System.out.println("first name:");
		while (true) {
			try {
				firstName = sc.nextLine();
/*
* calling validateFirstName method from validator object validateFirstName is a
* boolean method,this ans should be true or false
*/
				validator.validateFirstName(firstName);
				/*
				 * calling setFirstName method from contact object
				 */
				contact.setFirstName(firstName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("last name:");
		while (true) {
			try {
				lastName = sc.nextLine();
				/*
				 * calling validateLastName method from validator object validateLastName is a
				 * boolean method,this answer should be true or false
				 */
				validator.validateLastName(lastName);
				/**
				 * calling setLastName method from contact object
				 */
				contact.setLastName(lastName);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("address:");
		while (true) {
			try {
				address = sc.nextLine();
				/*
				 * calling validateLastName method from validator object validateLastName is a
				 * boolean method,this answer should be true or false
				 */
				validator.validateAddress(address);
				/*
				 * calling setAddress method from contact object
				 */
				contact.setAddress(address);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("city:");
		while (true) {
			try {
				city = sc.nextLine();
				/*
				 * calling validateCity method from validator object validateCity is a boolean
				 * method,this answer should be true or false
				 */
				validator.validateCity(city);
				/*
				 * calling setCity method from contact object
				 */
				contact.setCity(city);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("state:");
		while (true) {
			try {
				state = sc.nextLine();
				/*
				 * calling validateState method from validator object validateState is a boolean
				 * method,this answer should be true or false
				 */
				validator.validateState(state);
				/*
				 * calling setState method from contact object
				 */
				contact.setState(state);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("zip:");
		while (true) {
			try {
				zip = sc.nextLine();
				/*
				 * calling validateZip method from validator object validateZip is a boolean
				 * method,this answer should be true or false
				 */
				validator.validateZip(zip);
				/*
				 * calling setZip method from contact object
				 */
				contact.setZip(zip);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Phone Number:");
		while (true) {
			try {
				phoneNumber = sc.nextLine();
				/*
				 * calling validatePhoneNumber method from validator object validatePhoneNumber
				 * is a boolean method,this answer should be true or false
				 */
				validator.validatePhoneNumber(phoneNumber);
				/*
				 * calling setPhoneNumber method from contact object
				 */
				contact.setPhoneNumber(phoneNumber);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("email:");
		while (true) {
			try {
				email = sc.nextLine();
				/*
				 * calling validateEmail method from validator object validateEmail is a boolean
				 * method,this answer should be true or false
				 */
				validator.validateEmail(email);
				/*
				 * calling setEmail method from contact object
				 */
				contact.setEmail(email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\nContact is added successfully\n");
		return contact;

	}

	public void editExistingContact(ContactPerson contact) {
		while (true) {

			System.out.println("1 FirstName\n2 LastName\n3 Address\n4 City\n5 State\n6 Zip\n7 Phone\n8 Email\n9 Exit");
			int options = Integer.parseInt(sc.nextLine());

			switch (options) {

			case 1:
				System.out.println("Enter New FirstName");
				String newFirstName = sc.nextLine();
				contact.setFirstName(newFirstName);
				break;

			case 2:
				System.out.println("Enter New LastName");
				String newLastName = sc.nextLine();
				contact.setLastName(newLastName);
				break;

			case 3:
				System.out.println("Enter New Address");
				String newAddress = sc.nextLine();
				contact.setAddress(newAddress);
				break;

			case 4:
				System.out.println("Enter New City");
				String newCity = sc.nextLine();
				contact.setCity(newCity);
				break;

			case 5:
				System.out.println("Enter State");
				String newState = sc.nextLine();
				contact.setState(newState);
				break;

			case 6:
				System.out.println("Enter New Zip");
				String newZip = sc.nextLine();
				contact.setZip(newZip);
				break;

			case 7:
				System.out.println("Enter New Phone");
				String newPhone = sc.nextLine();
				contact.setPhoneNumber(newPhone);
				break;

			case 8:
				System.out.println("Enter New Email");
				String newEmail = sc.nextLine();
				contact.setFirstName(newEmail);
				break;

			case 9:
				System.out.println("Exit");
				return;

			default:
				System.out.println("Invalid");
				break;
			}
		}
	}

	public void displayContact(ContactPerson contact) {
		if (contact == null) {
			System.out.println("Contact not found");
			return;
		}
		System.out.println(contact);
	}
}
