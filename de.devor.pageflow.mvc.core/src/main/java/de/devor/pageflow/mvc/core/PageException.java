package de.devor.pageflow.mvc.core;

/**
 * Exception that indicates that an error occurred initializing the page model
 * or the page helper.
 * 
 * @author orapka
 *
 */
public class PageException extends Exception {

	private static final long serialVersionUID = 6787302049424786571L;

	/**
	 * Constructor.
	 * 
	 * @param message
	 *            The error message.
	 * @param cause
	 *            The exception that is the cause for this exception.
	 */
	public PageException(String message, Throwable cause) {
		super(message, cause);
	}

}
