package de.tum.in.ase.eist;

public class PhoneBookEntry {

	private final String name;
	private String phoneNumber;

	public PhoneBookEntry(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "name: " + name + ", phone number: " + phoneNumber;
	}
}
