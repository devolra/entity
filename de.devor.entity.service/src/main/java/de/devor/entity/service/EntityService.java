package de.devor.entity.service;

import java.util.List;

import de.devor.entity.model.Entity;

/**
 * Interface for the service to work with entities.
 * 
 * @author orapka
 *
 */
public interface EntityService {

	/**
	 * Adds the given entity.
	 * 
	 * @param entity
	 *            The entity.
	 * @throws EntityAlreadyExistsException
	 *             If an entity with the same name already exists.
	 */
	public void addEntity(Entity entity) throws EntityAlreadyExistsException;

	/**
	 * Returns the entities.
	 * 
	 * @return The entities.
	 */
	public List<Entity> getEntities();

	/**
	 * Removes all entities.
	 */
	public void removeAllEntities();

}
