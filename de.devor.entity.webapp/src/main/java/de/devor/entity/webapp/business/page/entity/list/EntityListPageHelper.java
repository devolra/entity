package de.devor.entity.webapp.business.page.entity.list;

import java.util.List;

import de.devor.entity.model.Entity;
import de.devor.pageflow.mvc.core.PageHelper;

/**
 * Interface of the page helper for the list of entities.
 * 
 * @author orapka
 *
 */
public interface EntityListPageHelper extends PageHelper {

	/**
	 * Sorts the given entities alphabetically (by name of entity) independent if
	 * the name starts with a capatalized letter or not.
	 * 
	 * @param entities
	 *            The entities.
	 */
	public void getSortedEntities(List<Entity> entities);

	/**
	 * Returns a comma-separated list of the indizes of the given entity.
	 * 
	 * If the entity doesn't have indizes an empty string is returned.
	 * 
	 * @param entity
	 *            The entity.
	 * @return The names of the indizes.
	 */
	public String getIndicesNames(Entity entity);

}
