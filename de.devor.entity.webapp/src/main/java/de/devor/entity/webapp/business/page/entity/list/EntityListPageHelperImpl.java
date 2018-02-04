package de.devor.entity.webapp.business.page.entity.list;

import java.util.List;

import de.devor.entity.model.Entity;
import de.devor.entity.model.Index;

/**
 * Implementation of the page helper.
 * @author orapka
 *
 */
class EntityListPageHelperImpl implements EntityListPageHelper {
	
	private static final long serialVersionUID = -2680989179741508758L;
	
	
	/**
	 * Constructor.
	 * @param model The model.
	 */
	public EntityListPageHelperImpl(EntityListPageModel model) {
	}

	/* (non-Javadoc)
	 * @see de.devor.entity.webapp.common.PageHelper#getPageTitle()
	 */
	@Override
	public String getPageTitle() {
		return "List of entities";
	}

	/* (non-Javadoc)
	 * @see de.devor.entity.webapp.common.PageHelper#getPageDescription()
	 */
	@Override
	public String getPageDescription() {
		return "Here you can find a summary of all entities.";
	}

	/* (non-Javadoc)
	 * @see de.devor.entity.webapp.business.page.entity.list.EntityListPageHelper#getSortedEntities(java.util.List)
	 */
	@Override
	public void getSortedEntities(List<Entity> entities) {
		// listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
		entities.sort((Entity entity1, Entity entity2) -> {
			return entity1.getName().toLowerCase().compareTo(entity2.getName().toLowerCase());
		});
	}

	/* (non-Javadoc)
	 * @see de.devor.entity.webapp.business.entity.list.EntityListPageHelper#getIndizesNames(de.devor.entity.model.Entity)
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
