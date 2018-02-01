package de.devor.entity.model;

import java.util.List;

/**
 * Represents the orimary key of an entity.
 * 
 * @author orapka
 *
 */
public interface PrimaryKey {

	public String getName();

	public void setName(String name);
	
	public List<Column> getColumns();
	
	public void addColumn(Column column);

}
