package com.perfectsquare.spring.javaconfig;

public class Artist {

	private String firstName;
	private String lastName;

	public Artist(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Artist [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
