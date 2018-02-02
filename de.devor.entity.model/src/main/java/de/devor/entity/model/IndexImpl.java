package de.devor.entity.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation.
 * 
 * @author orapka
 *
 */
class IndexImpl implements Index {

	private String name;
	private boolean isAscending = true;
	private List<Column> columns = new ArrayList<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.Index#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.Index#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.Index#isAscending()
	 */
	@Override
	public boolean isAscending() {
		return isAscending;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.Index#setAscending(boolean)
	 */
	@Override
	public void setAscending(boolean isAscending) {
		this.isAscending = isAscending;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.Index#getColumns()
	 */
	@Override
	public List<Column> getColumns() {
		return columns;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.Index#addColumn(de.devor.entity.model.Column)
	 */
	@Override
	public void addColumn(Column column) {
		columns.add(column);
	}

}
