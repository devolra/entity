package de.devor.entity.webapp.business.page.entity.list;

/**
 * Factory for the components (model, page helper, controller) for the page of
 * entities list.
 * 
 * @author orapka
 *
 */
public class EntityListPageFactory {

	/**
	 * Returns the model.
	 * 
	 * @return The model.
	 */
	public static EntityListPageModel getPageModel() {
		return new EntityListPageModelImpl();
	}

	/**
	 * Returns the page helper.
	 * 
	 * @return The page helper-
	 */
	public static EntityListPageHelper getPageHelper() {
		return new EntityListPageHelperImpl();
	}

	/**
	 * Returns the page controller.
	 * 
	 * @return The page controller.
	 */
	public static EntityListPageControllerImpl getPageController() {
		return new EntityListPageControllerImpl();
	}

}
