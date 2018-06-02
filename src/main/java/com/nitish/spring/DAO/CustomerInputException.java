package com.nitish.spring.DAO;

public class CustomerInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private Throwable obj;

	public CustomerInputException() {

	}

	public CustomerInputException(String message) {
		this.message = message;
	}

	public CustomerInputException(String message, Throwable obj) {
		this.message = message;
		this.obj = obj;
	}
}
