package com.application.model;

public class Employee {
private String FirstName;
private String LastName;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public Employee(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
}

}