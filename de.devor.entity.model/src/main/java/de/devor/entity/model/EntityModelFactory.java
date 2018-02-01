package de.devor.entity.model;

/**
 * Interface of the factory for the model.
 * 
 * @author orapka
 *
 */
public interface EntityModelFactory {

	public static final EntityModelFactory instance = new EntityModelFactoryImpl();

}
