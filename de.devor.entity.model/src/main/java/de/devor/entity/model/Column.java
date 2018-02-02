package de.devor.entity.model;

/**
 * Represents a column.
 * 
 * @author orapka
 *
 */
public interface Column {

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
	 * Returns the length.
	 * 
	 * @return The length.
	 */
	public int getLength();

	/**
	 * Sets the length.
	 * 
	 * @param length
	 *            The lnegth.
	 */
	public void setLength(int length);

	/**
	 * Returns the type.
	 * 
	 * @return The type.
	 */
	public ColumnType getType();

	/**
	 * Sets the type.
	 * 
	 * @param type
	 *            The type.
	 */
	public void setType(ColumnType type);

}
