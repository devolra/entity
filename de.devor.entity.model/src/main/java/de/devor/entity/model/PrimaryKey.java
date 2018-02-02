package de.devor.entity.model;

import java.util.List;

/**
 * Represents the orimary key of an entity.
 * 
 * @author orapka
 *
 */
public interface PrimaryKey {

	/**
	 * Returns the name.
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

}
