package de.devor.entity.pageflow.entity.list;

import java.util.List;

import de.devor.entity.model.Entity;

/**
 * Page model for the list of entities.
 * 
 * @author orapka
 *
 */
class EntityListPageModelImpl implements EntityListPageModel {

	private static final long serialVersionUID = -7163351509392511650L;

	private List<Entity> entities;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.entity.webapp.business.entity.list.EntityListPageModel#getEntities()
	 */
	@Override
	public List<Entity> getEntities() {
		return entities;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.entity.webapp.business.entity.list.EntityListPageModel#setEntities(
	 * java.util.List)
	 */
	@Override
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

}
