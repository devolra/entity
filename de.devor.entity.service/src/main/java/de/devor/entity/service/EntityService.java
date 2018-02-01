package de.devor.entity.service;

import de.devor.entity.model.Entity;

/**
 * Interface for the service to work with entities.
 * 
 * @author orapka
 *
 */
public interface EntityService {

	public static final EntityService instance = new EntityServiceImpl();
	
	/**
	 * Adds the given entity.
	 * 
	 * @param entity
	 *            The entity.
	 * @throws EntityAlreadyExistsException
	 *             If an entity with the same name already exists.
	 */
	public void addEntity(Entity entity) throws EntityAlreadyExistsException;

}
