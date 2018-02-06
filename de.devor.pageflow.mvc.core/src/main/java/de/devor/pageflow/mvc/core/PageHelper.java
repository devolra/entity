package de.devor.pageflow.mvc.core;

import java.io.Serializable;

/**
 * Marker interface for all page helpers.
 * 
 * @author orapka
 *
 */
public interface PageHelper extends Serializable {

	public static final String PAGE_HELPER = "PAGE_HELPER";
	
	/**
	 * Returns the title for the page.
	 * 
	 * @return The title.
	 */
	public String getPageTitle();

	/**
	 * Returns the description for the page.
	 * 
	 * @return The description.
	 */
	public String getPageDescription();

}
