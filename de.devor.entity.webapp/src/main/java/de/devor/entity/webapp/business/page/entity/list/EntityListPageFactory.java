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
	 * @param model
	 *            The model.
	 * @return @return The page helper-
	 */
	public static EntityListPageHelper getPageHelper(EntityListPageModel model) {
		return new EntityListPageHelperImpl(model);
	}

	/**
	 * Returns the page controller.
	 * 
	 * @return The page controller.
	 */
	public static EntityListPageController getPageController() {
		return new EntityListPageControllerImpl();
	}

}
