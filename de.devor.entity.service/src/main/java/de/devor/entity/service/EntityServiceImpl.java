package de.devor.entity.service;

import java.util.HashMap;
import java.util.Map;

import de.devor.entity.model.Entity;

/**
 * Implementation of the service.
 * 
 * @author orapka
 *
 */
class EntityServiceImpl implements EntityService {

	private Map<String, Entity> entities = new HashMap<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.entity.service.EntityService#addEntity(de.devor.entity.model.Entity)
	 */
	@Override
	public void addEntity(Entity entity) throws EntityAlreadyExistsException {
		// Check if the given entity entity alreay exists.
		String entityName = entity.getName();
		if (entities.containsKey(entityName)) {
			throw new EntityAlreadyExistsException("The entity " + entityName + " already exists.",
					new IllegalArgumentException());
		}

		entities.put(entityName, entity);
	}

}
