package com.IOstream;

import java.util.Objects;
import java.util.Scanner;

public class AddressBookMain {
	private static Scanner scanner = new Scanner(System.in);
	static ContactService contactService;
	static AddressBook addressBook;

	/*
	 * create a method name as findContact
	 */
	public static void findContact() {
		System.out.println("Enter Person Name");
		String name = scanner.nextLine();
		/*
		 * search this person by name in address book and display contact
		 */
		contactService.displayContact(addressBook.searchByName(name));
	}

	/*
	 * create a method name as editContact
	 */
	public static void editContact() {

		System.out.println("Enter Person Name");
		String name = scanner.nextLine();
		ContactPerson contact = addressBook.searchByName(name);

		if (Objects.nonNull(contact)) {
			/*
			 * calling editExistingContact method from contactService object
			 */
			contactService.editExistingContact(contact);
			return;
		}
		System.out.println("Person Not Found");
	}

	/*
	 * create a method name as createContact
	 */
	public static void createContact() {

		addressBook.addContact(contactService.createContact());
	}

	/*
	 * create a method name as deleteContact
	 */
	public static void deleteContact() {
		System.out.println("Enter Person Name");
		String name = scanner.nextLine();

		if (Objects.nonNull(addressBook.searchByName(name))) {
			addressBook.deleteContact(name);
			return;

		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Workshop");
		addressBook = new AddressBook();
		contactService = new ContactService(scanner);
		while (true) {
			System.out.println(
					"\nAddressbook Choose Options:\n 1. Add new contact\n 2. Edit existing contact\n 3 Delete contact\n 4. Show all Contacts\n 5. Find contact\n 6.Exit");
			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {

			case 1:
				createContact();
				break;

			case 2:
				editContact();
				break;

			case 3:
				deleteContact();
				break;

			case 4:
				System.out.println(addressBook);
				break;

			case 5:
				findContact();
				break;

			case 6:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid");
			}
		}
	}

	public static void displayContact(ContactPerson contact) {

		if (contact == null) {

			System.out.println("Contact not found");
			return;
		}

		System.out.println(contact);
	}
}
