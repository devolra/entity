package de.devor.entity.model.impl;

import de.devor.entity.model.Column;
import de.devor.entity.model.ColumnType;

/**
 * Implementation.
 * 
 * @author orapka
 *
 */
public class ColumnImpl implements Column {

	private String name;
	private int length;
	private ColumnType type;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Column#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Column#setName(int)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Column#getLength()
	 */
	@Override
	public int getLength() {
		return length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Column#setLength(int)
	 */
	@Override
	public void setLength(int length) {
		this.length = length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.eval.git.model.Column#getType()
	 */
	@Override
	public ColumnType getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.eval.git.model.Column#setType(de.devor.eval.git.model.ColumnType)
	 */
	@Override
	public void setType(ColumnType type) {
		this.type = type;
	}

}
