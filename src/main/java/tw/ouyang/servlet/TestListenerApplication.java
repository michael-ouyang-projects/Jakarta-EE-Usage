package tw.ouyang.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListenerApplication implements ServletContextListener {

	public TestListenerApplication() {
		System.out.println("CREATE TestListenerApplication");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("IN Application Listener");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("OUT Application Listener");
	}

}
