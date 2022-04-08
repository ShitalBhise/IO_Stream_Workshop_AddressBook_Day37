package com.IOstream;

import java.util.ArrayList;

public class AddressBook {
	private ArrayList<ContactPerson> addressList = new ArrayList<ContactPerson>();

	/*
	 * creating parameterized method named as setAddressList
	 * 
	 * @param addressList - person address list
	 */
	public void setAddressList(ArrayList<ContactPerson> addressList) {
		/*
		 * The "this" keyword is used to refer to the current object.
		 */
		this.addressList = addressList;
	}

	/*
	 * create a get method name as get AddressList The get method returns the value of
	 * the variable
	 * 
	 * @return addressList - person address list
	 */
	public ArrayList<ContactPerson> getAddressList() {
		return addressList;
	}

	/*
	 * create a add acontact method.this is parameterized method
	 * 
	 * @param contact - persons contact details.
	 */
	public void addContact(ContactPerson contact) {
		/*
		 * calling add method from addressList object
		 */
		addressList.add(contact);
	}

	/*
	 * create a method name as searchByName,this method is parameterized
	 * 
	 * @param name - person name in address book
	 * @return - person name in address list
	 */
	public ContactPerson searchByName(String name) {
		for (int i = 0; i < addressList.size(); ++i) {
			if (addressList.get(i).getName().contains(name))
				/**
				 * calling get method from addressList object
				 */
				return addressList.get(i);
		}
		return null;
	}

	/*
	 * create method named as deleteContact. this is parameterized method . it is
	 * boolean data type method which means this method output must be true or
	 * false.
	 * 
	 * @param name - person name in address book
	 * @return - delete name in address book
	 */
	public boolean deleteContact(String name) {
		for (int i = 0; i < addressList.size(); ++i) {
			if (addressList.get(i).getName().equalsIgnoreCase(name)) {
				/*
				 * calling remove method for delete a person name in address book from
				 * addressList object
				 */
				addressList.remove(i);
				return true;
			}
		}
		return false;
	}

	/*
	 * create a toString method
	 * 
	 * @return - person data
	 */
	public String toString() {
		/*
		 * StringBuilder created object for StringBuilder class ,object name as str.
		 */
		StringBuilder str = new StringBuilder();

		int count = 1;
		for (ContactPerson contact : addressList) {
			if (contact != null) {
				str.append(count + ". " + contact.getFirstName() + " " + contact.getLastName() + "\n");
				count++;
			}
		}
		/*
		 * Returns the length (character count). str length is 0,then return dislpay msg
		 * no contact found on console
		 */
		if (str.length() == 0)
			return "\nNo contact found";
		return str.toString();
	}
}

