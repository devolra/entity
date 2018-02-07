package de.devor.entity.pageflow.entity.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import de.devor.entity.model.Entity;
import de.devor.entity.pageflow.entity.list.EntityListPageFactory;
import de.devor.entity.pageflow.entity.list.EntityListPageHelper;
import de.devor.entity.pageflow.entity.list.EntityListPageModel;
import de.devor.entity.service.EntityService;
import de.devor.entity.service.EntityServiceFactory;
import de.devor.pageflow.mvc.core.ApplicationContext;
import de.devor.pageflow.mvc.core.ApplicationContextFactory;
import de.devor.pageflow.mvc.core.PageController;

/**
 * Tests for the controller.
 * 
 * @author orapka
 *
 */
public class EntityListPageControllerTest {

	@After
	public void after() {
		EntityService service = EntityServiceFactory.getEntityService();
		service.removeAllEntities();
	}
	
	@Test
	public void init() throws Exception {
		ApplicationContext context = ApplicationContextFactory.getApplicationContext();
		assertNotNull(context);

		PageController controller = EntityListPageFactory.getPageController();
		assertNotNull(controller);

		controller.init(context);

		EntityListPageModel pageModel = (EntityListPageModel) context.getPageModel();
		assertNotNull(pageModel);
		List<Entity> entities = pageModel.getEntities();
		assertNotNull(entities);
		int numberEntities = entities.size();
		assertEquals(3, numberEntities);

		EntityListPageHelper pageHelper = (EntityListPageHelper) context.getPageHelper();
		assertNotNull(pageHelper);
		assertEquals("List of entities", pageHelper.getPageTitle());
		assertEquals("Here you can find a summary of all entities.", pageHelper.getPageDescription());

		String[] expectedNames = new String[] { "AEntity", "aEntity", "BEntity" };
		String[] expectedDescriptions = new String[] { "Description for entity 1.", "Description for entity 2.",
				"Description for entity 3." };
		String expectedPrimaryKey = "primarykey";
		String[] expectedIndices = new String[] { "index0, index1", "", "index0" };
		for (int i = 0; i < numberEntities; i++) {
			Entity entity = entities.get(i);
			assertEquals(expectedNames[i], entity.getName());
			assertEquals(expectedDescriptions[i], entity.getDescription());
			assertEquals(expectedPrimaryKey, entity.getPrimaryKey().getName());
			assertEquals(expectedIndices[i], pageHelper.getIndicesNames(entity));
		}
	}
	
	@Test
	public void initNoEntities() throws Exception {
		ApplicationContext context = ApplicationContextFactory.getApplicationContext();

		PageController controller = EntityListPageFactory.getPageController();
		controller.init(context);

		EntityListPageModel pageModel = (EntityListPageModel) context.getPageModel();
		pageModel.setEntities(new ArrayList<>());
		List<Entity> entities = pageModel.getEntities();
		assertNotNull(entities);
		int numberEntities = entities.size();
		assertEquals(0, numberEntities);
	}

}
