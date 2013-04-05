package com.project.business.exceptions;


public class TestBusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TestBusinessException(String localizedMessage, Throwable cause) {
		super(localizedMessage, cause);
	}

	/**
	 * Constructor that allows you to provide a localized message for the
	 * exception.
	 * 
	 * @param localizedMessage
	 *            the localized message for the exception
	 *
	 */
	public TestBusinessException(String localizedMessage) {
		super(localizedMessage);
	}

}
