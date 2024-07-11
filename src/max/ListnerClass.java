package max;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import max.master.LocationDAO;

public class ListnerClass implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent ci) {
		System.out.println("contextInitialized");
		ServletContext ctx = ci.getServletContext();
		
		System.out.println(new LocationDAO().getStateDeatils().size());
		ctx.setAttribute("lst", new LocationDAO().getStateDeatils());
	}

}
