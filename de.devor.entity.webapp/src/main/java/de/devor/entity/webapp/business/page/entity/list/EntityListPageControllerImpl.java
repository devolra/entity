package de.devor.entity.webapp.business.page.entity.list;

import java.util.ArrayList;
import java.util.List;

import de.devor.entity.model.Column;
import de.devor.entity.model.ColumnType;
import de.devor.entity.model.Entity;
import de.devor.entity.model.EntityModelFactory;
import de.devor.entity.model.Index;
import de.devor.entity.model.PrimaryKey;
import de.devor.entity.service.EntityAlreadyExistsException;
import de.devor.entity.service.EntityService;
import de.devor.entity.service.EntityServiceFactory;
import de.devor.entity.webapp.common.AbstractPageController;
import de.devor.entity.webapp.common.PageException;
import de.devor.entity.webapp.common.PageHelper;
import de.devor.entity.webapp.common.PageModel;

/**
 * Implementation of the controller.
 * 
 * @author orapka
 *
 */
public class EntityListPageControllerImpl extends AbstractPageController implements EntityListPageController {

	private EntityListPageModel model;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.common.AbstractPageController#getPageModel()
	 */
	@Override
	protected PageModel getPageModel() throws PageException {
		try {
			model = initPageModel();
			return model;
		} catch (EntityAlreadyExistsException e) {
			throw new PageException("Error creating the page model.", e);
		}
	}

	//
	// Private helpers
	//

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.entity.webapp.common.AbstractPageController#getPageHelper(de.devor.
	 * entity.webapp.common.PageModel)
	 */
	@Override
	protected PageHelper getPageHelper(PageModel model) throws PageException {
		return EntityListPageFactory.getPageHelper((EntityListPageModel) model);
	}

	//
	// Private helpers
	//

	private EntityListPageModel initPageModel() throws EntityAlreadyExistsException {
		EntityListPageModel model = EntityListPageFactory.getPageModel();

		EntityService entityService = EntityServiceFactory.getEntityService();

		// Create some dummy data
		entityService.addEntity(getEntity1());
		entityService.addEntity(getEntity2());
		entityService.addEntity(getEntity3());

		List<Entity> entities = entityService.getEntities();
		model.setEntities(entities);

		return model;
	}

	// Dummy data:
	private List<Column> getColumns() {
		List<Column> columns = new ArrayList<>();

		columns.add(EntityModelFactory.createColumn("column0", 10, ColumnType.ALPHANUMERIC));
		columns.add(EntityModelFactory.createColumn("column1", 7, ColumnType.NUMERIC));

		return columns;
	}

	private PrimaryKey getPrimaryKey() {
		return EntityModelFactory.createPrimaryKey("primarykey", getColumns());
	}

	private List<Index> getIndizes() {
		List<Index> indizes = new ArrayList<>();

		indizes.add(EntityModelFactory.createIndex("index0", true, getColumns()));
		indizes.add(EntityModelFactory.createIndex("index1", false, getColumns()));

		return indizes;
	}

	private Entity getEntity1() {
		return EntityModelFactory.createEntity("AEntity", "Description for entity 1.", getColumns(), getPrimaryKey(),
				getIndizes());
	}

	private Entity getEntity2() {
		return EntityModelFactory.createEntity("aEntity", "Description for entity 2.", getColumns(), getPrimaryKey(),
				null);
	}

	private Entity getEntity3() {
		List<Index> indices = getIndizes();
		indices.remove(1);
		return EntityModelFactory.createEntity("BEntity", "Description for entity 3.", getColumns(), getPrimaryKey(),
				indices);
	}

}
