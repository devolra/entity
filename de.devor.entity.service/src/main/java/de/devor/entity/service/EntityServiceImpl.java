package de.devor.entity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.devor.entity.model.Entity;

/**
 * Implementation of the service.
 * 
 * @author orapka
 *
 */
class EntityServiceImpl implements EntityService {

	private List<Entity> entities = new ArrayList<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.entity.service.EntityService#addEntity(de.devor.entity.model.Entity)
	 */
	@Override
	public void addEntity(Entity entity) throws EntityAlreadyExistsException {
		String entityName = entity.getName();
		// Check if the given entity entity alreay exists.

		List<String> knownEntityNames = entities.stream().map(e -> e.getName()).collect(Collectors.toList());
		if (knownEntityNames.contains(entityName)) {
			throw new EntityAlreadyExistsException("The entity " + entityName + " already exists.",
					new IllegalArgumentException());
		}

		entities.add(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.service.EntityService#getEntities()
	 */
	@Override
	public List<Entity> getEntities() {
		return entities;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.service.EntityService#removeAllEntities()
	 */
	@Override
	public void removeAllEntities() {
		entities.clear();
	}

}
