package tw.ouyang.servlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class TestListenerSession implements HttpSessionListener {

	public TestListenerSession() {
		System.out.println("CREATE TestListenerSession");
	}
	
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("IN Session Listener");
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("OUT Session Listener");
    }
	
}
