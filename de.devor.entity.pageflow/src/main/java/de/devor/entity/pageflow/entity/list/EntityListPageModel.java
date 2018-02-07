package de.devor.entity.pageflow.entity.list;

import java.util.List;

import de.devor.entity.model.Entity;
import de.devor.pageflow.mvc.core.PageModel;

/**
 * Interface for the page model of the list of entities.
 * 
 * @author orapka
 *
 */
public interface EntityListPageModel extends PageModel {

	/**
	 * Returns the entities.
	 * 
	 * @return The entities.
	 */
	public List<Entity> getEntities();

	/**
	 * Sets the entities.
	 * 
	 * @param entities
	 *            The entities.
	 */
	public void setEntities(List<Entity> entities);

}
