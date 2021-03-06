package com.regex;
import java.util.Scanner;
/**
 * @author BALU
 * Ability to ask user details
 * Calling validation to check for user input 
 */
public class UserRegistration {
	//Objects
	static Details details = new Details();
	static Scanner scanner = new Scanner(System.in);
	
 	/**
 	 * Ability to ask user for his first name
 	 * Validates the user input by calling method
 	 */
 	public void userFirstName() {
		System.out.println("Enter the First Name :");
		details.setFirstName(scanner.next());
		Validater.CheckFirstname(details);
	}
 	
 	/**
 	 * Ability to ask user for his last name
 	 * Validates the user input by calling method
 	 */
 	public void userLastName() {
		System.out.println("\nEnter the Last Name :");
		details.setLastName(scanner.next());
		Validater.CheckLastname(details);
	}
 	
 	/**
 	 * Ability to ask user for his E-mail
 	 * Validates the user input by calling method
 	 */
 	public void userEmail() {
		System.out.println("\nEnter the E-mail :");
		details.setEmail(scanner.next());
		Validater.CheckEmail(details);
	}
 	
 	/**
 	 * Ability to ask user for his Password
 	 * Validates the user input by calling method
 	 */
 	public void userPassword() {
		System.out.println("\nEnter the Password :");
		details.setPassword(scanner.next());
		Validater.CheckPassword(details);
	}
 	
 	/**
 	 * Ability to ask user for his phone number
 	 * Validates the user input by calling method
 	 */
 	public void userPhoneNumber() {
		System.out.println("\nEnter the Phone Number :");
		details.setPhoneNumber(scanner.nextLine());
		Validater.CheckPhoneNumber(details);
	}

}