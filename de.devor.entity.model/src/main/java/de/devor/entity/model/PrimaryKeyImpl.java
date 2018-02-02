package de.devor.entity.model;

import java.util.ArrayList;
import java.util.List;

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
