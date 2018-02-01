package de.devor.entity.model;

import java.util.List;

/**
 * Represents an Index.
 * 
 * @author orapka
 *
 */
public interface Index {

	public String getName();

	public void setName(String name);
	
	public boolean isAscending();
	
	public void setAscending(boolean isAscending);

	public List<Column> getColumns();

	public void addColumn(Column column);

}
