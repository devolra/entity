package de.devor.entity.model.impl;

import java.util.ArrayList;
import java.util.List;

import de.devor.entity.model.Column;
import de.devor.entity.model.Index;

/**
 * Implementation.
 * 
 * @author orapka
 *
 */
class IndexImpl implements Index{

	private String name;
	private boolean isAscending = true;
	private List<Column> columns = new ArrayList<>();
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean isAscending() {
		return isAscending;
	}
	
	@Override
	public void setAscending(boolean isAscending) {
	this.isAscending = isAscending;	
	}
	
	@Override
	public List<Column> getColumns() {
		return columns;
	}

	@Override
	public void addColumn(Column column) {
		columns.add(column);
	}

}
