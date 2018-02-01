package de.devor.entity.model.impl;

import java.util.ArrayList;
import java.util.List;

import de.devor.entity.model.Column;
import de.devor.entity.model.PrimaryKey;

/**
 * Implementation.
 * 
 * @author orapka
 *
 */
class PrimaryKeyImpl implements PrimaryKey {

	private String name;
	private List<Column> columns = new ArrayList<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.PrimaryKey#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.PrimaryKey#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.PrimaryKey#getColumns()
	 */
	@Override
	public List<Column> getColumns() {
		return columns;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.eval.git.model.PrimaryKey#addColumn(de.devor.eval.git.model.Column)
	 */
	@Override
	public void addColumn(Column column) {
		columns.add(column);
	}

}
