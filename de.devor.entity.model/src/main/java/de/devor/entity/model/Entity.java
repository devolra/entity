package de.devor.entity.model;

import java.util.List;

/**
 * Represents an entity.
 * 
 * @author orapka
 *
 */
public interface Entity {

	public String getName();
	
	public void setName(String name);
	
	public List<Column> getColumns();
	
	public void addColumn(Column column);
	
	public PrimaryKey getPrimaryKey();
	
	public void setPrimaryKey(PrimaryKey primaryKey);
	
	public List<Index> getIndices();
	
	public void addIndex(Index index);
	
}
