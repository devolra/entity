package de.devor.entity.service;

/**
 * Exception that indicates that an entity already exists.
 * 
 * @author orapka
 *
 */
public class EntityAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -6316848420713883280L;

	public EntityAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
	}

}
