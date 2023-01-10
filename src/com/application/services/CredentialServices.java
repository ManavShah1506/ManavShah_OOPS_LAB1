package com.application.services;
import com.application.model.Employee;
public interface CredentialServices {
public String passwordGenerator();
public String emailGenerator(Employee employee, String department);
public void displayCredentials(Employee employee, String department);

}
