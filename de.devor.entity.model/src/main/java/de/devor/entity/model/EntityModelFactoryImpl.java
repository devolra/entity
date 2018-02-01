package de.devor.entity.model;

import de.devor.entity.model.impl.ColumnImpl;

/**
 * Implementation of the factory for the model.
 * 
 * @author orapka
 *
 */
class EntityModelFactoryImpl implements EntityModelFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.model.EntityModelFactory#createColumn(java.lang.String,
	 * int, de.devor.entity.model.ColumnType)
	 */
	@Override
	public Column createColumn(String name, int length, ColumnType columnType) {
		Column column = new ColumnImpl();
		column.setName(name);
		column.setLength(length);
		column.setType(columnType);
		return column;
	}

}
