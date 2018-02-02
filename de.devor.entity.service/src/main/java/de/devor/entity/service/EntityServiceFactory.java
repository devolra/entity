package de.devor.entity.service;

/**
 * Factory for the service.
 * 
 * @author orapka
 *
 */
public class EntityServiceFactory {

	private static EntityService entityService;

	/**
	 * Returns the service to work with entities.
	 * 
	 * The service is stateful. So it is a singleton.
	 * 
	 * @returnm The service.
	 */
	public static EntityService getEntityService() {
		if (entityService == null) {
			entityService = new EntityServiceImpl();
		}
		return entityService;
	}

}
