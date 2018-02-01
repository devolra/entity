package de.devor.entity.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Tests fpr the factory.
 * 
 * @author orapka
 *
 */
public class EntityModelFactoryTest {

	@Test
	public void instance() {
		EntityModelFactory factory = EntityModelFactory.instance;
		assertNotNull(factory);

		EntityModelFactory testFactory = EntityModelFactory.instance;
		assertEquals(factory, testFactory);
	}

	@Test
	public void createColumn() {
		EntityModelFactory factory = EntityModelFactory.instance;

		Column column = factory.createColumn("column0", 10, ColumnType.ALPHANUMERIC);

		assertNotNull(column);
		assertEquals("column0", column.getName());
		assertEquals(10, column.getLength());
		assertEquals(ColumnType.ALPHANUMERIC, column.getType());
	}

}
