package de.devor.entity.model;

/**
 * Represents a column.
 * 
 * @author orapka
 *
 */
public interface Column {

	public String getName();

	public void setName(String name);

	public int getLength();

	public void setLength(int length);

	public ColumnType getType();

	public void setType(ColumnType type);

}
