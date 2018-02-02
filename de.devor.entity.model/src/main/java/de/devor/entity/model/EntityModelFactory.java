package de.devor.entity.model;

import java.util.List;

/**
 * Factory for the model.
 * 
 * @author orapka
 *
 */
public class EntityModelFactory {

	/**
	 * Creates a new column.
	 * 
	 * @param name
	 *            The name.
	 * @param length
	 *            The length.
	 * @param columnType
	 *            The type.
	 * @return The new column.
	 */
	public static Column createColumn(String name, int length, ColumnType columnType) {
		Column column = new ColumnImpl();
		column.setName(name);
		column.setLength(length);
		column.setType(columnType);
		return column;
	}

	/**
	 * Creates a primary key.
	 * 
	 * @param name
	 *            The name.
	 * @param columns
	 *            The columns.
	 * @return The primary key.
	 */
	public static PrimaryKey createPrimaryKey(String name, List<Column> columns) {
		PrimaryKey primaryKey = new PrimaryKeyImpl();
		primaryKey.setName(name);
		columns.stream().forEach(c -> primaryKey.addColumn(c));
		return primaryKey;
	}

	/**
	 * Creates an index.
	 * 
	 * @param name
	 *            The name.
	 * @param isAscending
	 *            Flnag that indicates if the index is ascending.
	 * @param columns
	 *            The columns.
	 * @return The index.
	 */
	public static Index createIndex(String name, boolean isAscending, List<Column> columns) {
		Index index = new IndexImpl();
		index.setName(name);
		index.setAscending(isAscending);
		columns.stream().forEach(c -> index.addColumn(c));
		return index;
	}

	/**
	 * Creates an entity.
	 * 
	 * @param name
	 *            The name.
	 * @param description
	 *            The description.
	 * @param columns
	 *            Thhe columns.
	 * @param primaryKey
	 *            The primray key.
	 * @param indizes
	 *            The indizes.
	 * @return The entity.
	 */
	public static Entity createEntity(String name, String description, List<Column> columns, PrimaryKey primaryKey,
			List<Index> indizes) {
		Entity entity = new EntityImpl();
		entity.setName(name);
		entity.setDescription(description);
		columns.stream().forEach(c -> entity.addColumn(c));
		entity.setPrimaryKey(primaryKey);
		indizes.stream().forEach(i -> entity.addIndex(i));
		return entity;
	}

}
