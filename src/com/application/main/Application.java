package com.application.main;
import java.util.Scanner;

import com.application.model.Employee;
import com.application.services.CredentialServiceImpl;
import com.application.services.CredentialServices;
public class Application {

	
	public static void main(String[] args) {
		CredentialServices Service = new CredentialServiceImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your First Name - ");
		String firstName = scan.next();
		System.out.println("Please enter your Last Name - ");
		String lastName = scan.next();
		Employee employee = new Employee(firstName, lastName);
		String department = null;
		Service.passwordGenerator();
		System.out.println("Please choose your department from the list given below: ");
		System.out.println("A. Press 1 for Technical Department" );
		System.out.println("B. Press 2 for Admin Department" );
		System.out.println("C. Press 3 for Human Resource Department" );
		System.out.println("D. Press 4 for Legal Department" );
		System.out.println("------------------------------");
		System.out.println("Please enter your choice");
        
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			department = "technical";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;	
		
		default:
			System.out.println("Please try again & enter the correct choice from the options given above: ");	
			return;
		}
        
		Service.emailGenerator(employee, department);
		Service.displayCredentials(employee, department);
		
   }
}
