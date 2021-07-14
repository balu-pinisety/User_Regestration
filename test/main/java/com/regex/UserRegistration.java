package main.java.com.regex;

import java.util.Scanner;

/**
 * @author BALU
 * Ability to ask user details 
 * Calling validation to check for user input
 */
public class UserRegistration {
	
	// Objects
	static Scanner scanner = new Scanner(System.in);
	static Validater validate = new Validater();

	/** Ability to ask user for his first name and Checks it */
	public void userFirstName() {
		System.out.println("\nEnter the First Name:");
		String string=scanner.nextLine();
		try {
			boolean result = validate.checkName(string);
			if (result) System.out.println("Valid Input");
			else if(string=="") throw new userException("Invalid Input");
			else {
				System.out.println("Invalid Input");
				userFirstName();
			}
		} catch (userException | NullPointerException e) {
			System.out.println(e.getMessage());
			userFirstName();
		}
	}

	/** Ability to ask user for his last name and Checks it */
	public void userLastName() {
		System.out.println("\nEnter the Last Name:");
		String string=scanner.nextLine();
		try {
			boolean result = validate.checkName(string);
			if (result) System.out.println("Valid Input");
			else if(string=="") throw new userException("Invalid Input");
			else {
				System.out.println("Invalid Input");
				userLastName();
			}
		} catch (userException | NullPointerException e) {
			System.out.println(e.getMessage());
			userLastName();
		}
	}

	/** Ability to ask user for his E-mail and checks it */
	public void userEmail() {
		System.out.println("\nEnter the E-mail :");
		String string=scanner.nextLine();
		try {
			boolean result = validate.checkEmail(string);
			if (result) System.out.println("Valid Input");
			else if(string=="") throw new userException("Invalid Input");
			else {
				System.out.println("Invalid Input");
				userEmail();
			}
		} catch (userException | NullPointerException e) {
			System.out.println(e.getMessage());
			userEmail();
		}
	}
	
	/** Ability to ask user for his Phone Number and checks it */
	public void userPhoneNumber() {
		System.out.println("\nEnter the Phone Number :");
		String string=scanner.nextLine();
		try {
			boolean result = validate.checkMobileNumber(string);
			if (result) System.out.println("Valid Input");
			else if(string=="") throw new userException("Invalid Input");
			else {
				System.out.println("Invalid Input");
				userPhoneNumber();
			}
		} catch (userException | NullPointerException e) {
			System.out.println(e.getMessage());
			userPhoneNumber();
		}
	}
	
	/** Ability to ask user for new Password and check it */
	public void userPassword() {
		System.out.println("\nEnter the Password :");
		String string=scanner.nextLine();
		try {
			boolean result = validate.checkPassword(string);
			if (result) System.out.println("Valid Input");
			else if(string=="") throw new userException("Invalid Input");
			else {
				System.out.println("Invalid Input");
				userPassword();
			}
		} catch (userException | NullPointerException e) {
			System.out.println(e.getMessage());
			userPassword();
		}
	}
	
}