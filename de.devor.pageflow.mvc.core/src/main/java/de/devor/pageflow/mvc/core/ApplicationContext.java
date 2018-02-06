package de.devor.pageflow.mvc.core;

import java.io.Serializable;

/**
 * Context for the application.
 * 
 * Acts as a container for PageModels und PageHelpers.
 * 
 * @author orapka
 *
 */
public interface ApplicationContext extends Serializable {

	public static final String APPLICATION_CONTEXT = "APPLICATION_CONTEXT";
	
	public static final String BASE_URL = "/entity/";

	/**
	 * Returns the curent page model.
	 * 
	 * @return The current page model.
	 */
	public PageModel getPageModel();

	/**
	 * Sets the current page model.
	 * 
	 * @param pageModel
	 *            The current page model.
	 */
	public void setPageModel(PageModel pageModel);

	/**
	 * Returns the current page helper-
	 * 
	 * @return The current page helper.
	 */
	public PageHelper getPageHelper();

	/**
	 * Sets the current page helper.
	 * 
	 * @param pageHelper
	 *            The page helper.
	 */
	public void setPageHelper(PageHelper pageHelper);

}
