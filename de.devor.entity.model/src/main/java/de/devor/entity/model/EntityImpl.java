package de.devor.entity.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation.
 * 
 * @author orapka
 *
 */
class EntityImpl implements Entity {

	private String name;
	private String description;
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
	 * @see de.devor.entity.model.Entity#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.Entity#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
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
