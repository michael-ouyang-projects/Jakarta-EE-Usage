package tw.ouyang.servlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListenerRequest implements ServletRequestListener {

	public TestListenerRequest() {
		System.out.println("CREATE TestListenerRequest");
	}
	
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("IN Request Listener");
	}

	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("OUT Request Listener");
	}

}
