package de.devor.entity.model.impl;

import java.util.ArrayList;
import java.util.List;

import de.devor.entity.model.Column;
import de.devor.entity.model.Entity;
import de.devor.entity.model.Index;
import de.devor.entity.model.PrimaryKey;

/**
 * Implementation.
 * 
 * @author orapka
 *
 */
class EntityImpl implements Entity {

	private String name;
	private List<Column> columns = new ArrayList<>();
	private PrimaryKey primaryKey;
	private List<Index> indices = new ArrayList<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#getColumns()
	 */
	@Override
	public List<Column> getColumns() {
		return columns;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#addColumn(de.devor.eval.git.model.Column)
	 */
	@Override
	public void addColumn(Column column) {
		columns.add(column);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#getPrimaryKey()
	 */
	@Override
	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#setPrimaryKey(de.devor.eval.git.model.
	 * PrimaryKey)
	 */
	@Override
	public void setPrimaryKey(PrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#getIndices()
	 */
	@Override
	public List<Index> getIndices() {
		return indices;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Entity#addIndex(de.devor.eval.git.model.Index)
	 */
	@Override
	public void addIndex(Index index) {
		indices.add(index);
	}

}
