package de.devor.pageflow.mvc.core;

/**
 * Marker interface for all page controllers.
 * 
 * @author orapka
 *
 */
public interface PageController {

	/**
	 * Initializes the page model and the page helper-
	 * 
	 * @param applicationContext
	 *            The application context.
	 * @throws PageException
	 *             If an error occurs initializing the page model or the page
	 *             helper.
	 */
	public void init(ApplicationContext applicationContext) throws PageException;

}
