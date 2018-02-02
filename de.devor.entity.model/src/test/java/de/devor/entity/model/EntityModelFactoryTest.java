package de.devor.entity.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Tests for the factory.
 * 
 * @author orapka
 *
 */
public class EntityModelFactoryTest {

	@Test
	public void createColumn() {
		List<Column> columns = getColumns();
		expectColumns(columns);
	}

	@Test
	public void createPrimaryKey() {
		PrimaryKey primaryKey = getPrimaryKey();
		expectPrimaryKey(primaryKey);
	}

	@Test
	public void createIndex() {
		List<Index> indizes = getIndizes();
		expectIndizes(indizes);
	}

	@Test
	public void createEntity() {
		Entity entity = getEntity();
		expectEntity(entity);
	}

	//
	// private helpers
	//

	private List<Column> getColumns() {
		List<Column> columns = new ArrayList<>();

		columns.add(EntityModelFactory.createColumn("column0", 10, ColumnType.ALPHANUMERIC));
		columns.add(EntityModelFactory.createColumn("column1", 7, ColumnType.NUMERIC));

		return columns;
	}

	private void expectColumns(List<Column> columns) {
		expectColumn0(columns.get(0));
		expectColumn1(columns.get(1));
	}

	private void expectColumn0(Column column) {
		assertNotNull(column);
		assertEquals("column0", column.getName());
		assertEquals(10, column.getLength());
		assertEquals(ColumnType.ALPHANUMERIC, column.getType());
	}

	private void expectColumn1(Column column) {
		assertNotNull(column);
		assertEquals("column1", column.getName());
		assertEquals(7, column.getLength());
		assertEquals(ColumnType.NUMERIC, column.getType());
	}

	private PrimaryKey getPrimaryKey() {
		return EntityModelFactory.createPrimaryKey("primarykey", getColumns());
	}

	private void expectPrimaryKey(PrimaryKey primaryKey) {
		assertNotNull(primaryKey);

		assertEquals("primarykey", primaryKey.getName());
		expectColumns(primaryKey.getColumns());
	}

	private List<Index> getIndizes() {
		List<Index> indizes = new ArrayList<>();

		indizes.add(EntityModelFactory.createIndex("index0", true, getColumns()));
		indizes.add(EntityModelFactory.createIndex("index1", false, getColumns()));

		return indizes;
	}

	private void expectIndizes(List<Index> indizes) {
		expectIndex0(indizes.get(0));
		expectIndex1(indizes.get(1));
	}

	private void expectIndex0(Index index) {
		assertNotNull(index);
		assertEquals("index0", index.getName());
		assertTrue(index.isAscending());
		expectColumns(index.getColumns());
	}

	private void expectIndex1(Index index) {
		assertNotNull(index);
		assertEquals("index1", index.getName());
		assertFalse(index.isAscending());
		expectColumns(index.getColumns());
	}

	private Entity getEntity() {
		return EntityModelFactory.createEntity("entity0", "description for entity 0", getColumns(), getPrimaryKey(),
				getIndizes());
	}

	private void expectEntity(Entity entity) {
		assertNotNull(entity);
		assertEquals("entity0", entity.getName());
		assertEquals("description for entity 0", entity.getDescription());
		expectColumns(entity.getColumns());
		expectPrimaryKey(entity.getPrimaryKey());
		expectIndizes(entity.getIndices());
	}

}
