package de.devor.pageflow.mvc.core;

/**
 * Factory for the application context (singleton).
 * 
 * @author orapka
 *
 */
public class ApplicationContextFactory {

	private static ApplicationContext applicationContext;

	/**
	 * Returns the application context.
	 * 
	 * @return The appplication context.
	 */
	public static ApplicationContext getApplicationContext() {
		if (applicationContext == null) {
			applicationContext = new ApplicationContextImpl();
		}
		return applicationContext;
	}

}
