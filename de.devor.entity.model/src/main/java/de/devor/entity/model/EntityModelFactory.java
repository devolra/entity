package de.devor.entity.model;

/**
 * Interface of the factory for the model.
 * 
 * @author orapka
 *
 */
public interface EntityModelFactory {

	public static final EntityModelFactory instance = new EntityModelFactoryImpl();

	/**
	 * Creates a new column.
	 * 
	 * @param name
	 *            The name.
	 * @param length
	 *            The length.
	 * @param columnType
	 *            The type.
	 * @return The new column.
	 */
	public Column createColumn(String name, int length, ColumnType columnType);

}
