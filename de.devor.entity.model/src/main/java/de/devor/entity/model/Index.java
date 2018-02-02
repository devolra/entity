package de.devor.entity.model;

import java.util.List;

/**
 * Represents an Index.
 * 
 * @author orapka
 *
 */
public interface Index {

	/**
	 * Returs the name.
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
	 * Returns if ascending.
	 * 
	 * @return true, if ascending, false if descending.
	 */
	public boolean isAscending();

	/**
	 * Sets if ascending.
	 * 
	 * @param isAscending
	 *            true, if ascending, false, if descendinhg.
	 */
	public void setAscending(boolean isAscending);

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
