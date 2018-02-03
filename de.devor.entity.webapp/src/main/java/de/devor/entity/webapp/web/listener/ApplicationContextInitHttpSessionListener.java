package de.devor.entity.webapp.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import de.devor.entity.webapp.business.page.entity.list.EntityListPageFactory;
import de.devor.entity.webapp.common.ApplicationContext;
import de.devor.entity.webapp.common.ApplicationContextFactory;
import de.devor.entity.webapp.common.PageController;
import de.devor.entity.webapp.common.PageException;

/**
 * HttpSessionListener to iniitialize the ApplicationContext when the session is
 * created.
 * 
 * @author orapka
 *
 */
@WebListener
public class ApplicationContextInitHttpSessionListener implements HttpSessionListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.
	 * HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		// If this method is called then the web page is called for the first time by a
		// user.
		// So we create the application context (singleton) and add it to the session.
		// So the pages csn access the page model and the page helper.
		ApplicationContext context = ApplicationContextFactory.getApplicationContext();
		session.setAttribute(ApplicationContext.APPLICATION_CONTEXT, context);
		// We also must initialize the controller of the first page shown. This
		// initializes the page model and the page helper for the page.
		PageController controller = EntityListPageFactory.getPageController();
		try {
			controller.init(context);
		} catch (PageException e) {
			throw new RuntimeException("Error initializing the page controller for the list of entities", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.
	 * HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// Must also be implemnted. Instead an AbstractMethodError appears when the
		// session is destoyed.
		// Nothing to do.
	}

}
