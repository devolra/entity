package de.devor.pageflow.mvc.core;

/**
 * Implementation of the page context.
 * 
 * @author orapka
 *
 */
class ApplicationContextImpl implements ApplicationContext {
	
	private static final long serialVersionUID = 2130780475382086590L;
	
	private PageModel pageModel;
	private PageHelper pageHelper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.common.ApplicationContext#getPageModel()
	 */
	@Override
	public PageModel getPageModel() {
		return pageModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.devor.entity.webapp.common.ApplicationContext#setPageModel(de.devor.entity
	 * .webapp.common.PageModel)
	 */
	@Override
	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.common.ApplicationContext#getPageHelper()
	 */
	@Override
	public PageHelper getPageHelper() {
		return pageHelper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.devor.entity.webapp.common.ApplicationContext#setPageHelper(de.devor.
	 * entity.webapp.common.PageHelper)
	 */
	@Override
	public void setPageHelper(PageHelper pageHelper) {
		this.pageHelper = pageHelper;
	}

}
