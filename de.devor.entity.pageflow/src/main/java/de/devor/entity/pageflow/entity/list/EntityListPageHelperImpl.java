package de.devor.entity.pageflow.entity.list;

import java.util.List;

import de.devor.entity.model.Entity;
import de.devor.entity.model.Index;

/**
 * Implementation of the page helper.
 * 
 * @author orapka
 *
 */
class EntityListPageHelperImpl implements EntityListPageHelper {

	private static final long serialVersionUID = -2680989179741508758L;

	private EntityListPageModel model;

	/**
	 * Constructor.
	 * 
	 * @param model
	 *            The model.
	 */
	public EntityListPageHelperImpl(EntityListPageModel model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.common.PageHelper#getPageTitle()
	 */
	@Override
	public String getPageTitle() {
		return "List of entities";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.common.PageHelper#getPageDescription()
	 */
	@Override
	public String getPageDescription() {
		List<Entity> entities = model.getEntities();
		if (entities != null && entities.size() > 0) {
			return "Here you can find a summary of all entities.";
		}
		return "There are no entities configured yet. Please...";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.business.page.entity.list.EntityListPageHelper#
	 * getSortedEntities(java.util.List)
	 */
	@Override
	public void getSortedEntities(List<Entity> entities) {
		entities.sort((Entity entity1, Entity entity2) -> {
			return entity1.getName().toLowerCase().compareTo(entity2.getName().toLowerCase());
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.business.entity.list.EntityListPageHelper#
	 * getIndizesNames(de.devor.entity.model.Entity)
	 */
	@Override
	public String getIndicesNames(Entity entity) {
		List<Index> indices = entity.getIndices();

		if (indices == null || indices.size() == 0) {
			return "";
		}

		StringBuilder indizesBuilder = new StringBuilder();
		int numberIndices = indices.size();
		for (int i = 0; i < numberIndices; i++) {
			indizesBuilder.append(indices.get(i).getName());
			if (i < numberIndices - 1) {
				indizesBuilder.append(", ");
			}
		}
		return indizesBuilder.toString();
	}

}
