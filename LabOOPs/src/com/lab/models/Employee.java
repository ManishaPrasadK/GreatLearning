package com.lab.models;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	
}
