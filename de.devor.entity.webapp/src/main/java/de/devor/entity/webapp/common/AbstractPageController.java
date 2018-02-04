package de.devor.entity.webapp.common;

/**
 * Can be used by page controllers that create a page model and a page helper.
 * 
 * @author orapka
 *
 */
public abstract class AbstractPageController implements PageController {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.entity.webapp.common.PageController#init(de.devor.entity.webapp.
	 * common.ApplicationContext)
	 */
	@Override
	public void init(ApplicationContext applicationContext) throws PageException {
		// Create page model and page helper and update the application context.
		PageModel model = getPageModel();
		applicationContext.setPageModel(model);
		applicationContext.setPageHelper(getPageHelper(model));
	}

	/**
	 * Callback to create the page model.
	 * 
	 * @return The page model.
	 * @throws PageException
	 *             If an error occurs createing the model.
	 */
	protected abstract PageModel getPageModel() throws PageException;

	/**
	 * Callback to create the page helper.
	 * 
	 * @return The page helper.
	 */

	/**
	 * Callback to create the page helper.
	 * 
	 * @return The page helper.
	 * @throws PageException
	 *             If an error oiccurs creating the page helper.
	 */

	/**
	 * Callback to create the page helper.
	 * 
	 * @param model
	 *            The model.
	 * @return The page helper.
	 * @throws PageException
	 *             If an error oiccurs creating the page helper.
	 */
	protected abstract PageHelper getPageHelper(PageModel model) throws PageException;

}
