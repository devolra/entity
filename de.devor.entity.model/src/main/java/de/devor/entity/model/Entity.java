package de.devor.entity.model;

import java.util.List;

/**
 * Represents an entity.
 * 
 * @author orapka
 *
 */
public interface Entity {

	/**
	 * Returns the name,
	 * 
	 * @return The name.
	 */
	public String getName();

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            The name.
	 */
	public void setName(String name);

	/**
	 * Returns the description.
	 * 
	 * @return The description.
	 */
	public String getDescription();

	/**
	 * Sets the description.
	 * 
	 * @param description
	 *            The description.
	 */
	public void setDescription(String description);

	/**
	 * Returns the columns.
	 * 
	 * @return The columns.
	 */
	public List<Column> getColumns();

	/**
	 * Adds a column.
	 * 
	 * @param column
	 *            The column.
	 */
	public void addColumn(Column column);

	/**
	 * Returns the primary key.
	 * 
	 * @return The primary key.
	 */
	public PrimaryKey getPrimaryKey();

	/**
	 * Set primary key.
	 * 
	 * @param primaryKey
	 *            The primary key.
	 */
	public void setPrimaryKey(PrimaryKey primaryKey);

	/**
	 * Returns the indices.
	 * 
	 * @return The indices.
	 */
	public List<Index> getIndices();

	/**
	 * Adds an index.
	 * 
	 * @param index
	 *            The index.
	 */
	public void addIndex(Index index);

}
