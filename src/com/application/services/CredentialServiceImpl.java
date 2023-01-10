package com.application.services;

import java.util.Random;

import com.application.model.Employee;

public class CredentialServiceImpl implements CredentialServices {

	@Override
	public String passwordGenerator() {
		// TODO Auto-generated method stub
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*<>";
		String values = capChars+smallChars+numbers+symbols;
		
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			int randomNumber = random.nextInt(values.length());
			password[i]=values.charAt(randomNumber);
		}
		return new String(password);
		
	}

	@Override
	public String emailGenerator(Employee employee, String department) {
		// TODO Auto-generated method stub
		String x = ((employee.getFirstName()+employee.getLastName()).toLowerCase()+"@"+department+".companyname.com");
	    return x; 
	}

	@Override
	public void displayCredentials(Employee employee, String department) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+employee.getFirstName()+employee.getLastName()+" your credentials are as follows: ");
		System.out.println("Email ID - "+emailGenerator(employee, department));
		System.out.println("Password is: "+passwordGenerator());
		
	}

}
