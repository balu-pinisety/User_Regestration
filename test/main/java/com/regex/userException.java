package com.regex;

/**
 * @author BALU
 * Provides Custom Message for invalid inputs
 */
public class userException extends Exception {

	private String message;
	
	public String getMessage() {
		return "Enter the letters";
	}
	public userException(String message) {
		super(message);
	}

}
