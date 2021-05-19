package tw.ouyang.websocket;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

@Component
@ServerEndpoint("/websocket")
public class WebSocketEndpoint {

	@OnOpen
	public void connectionOpened() {
		System.out.println("connection opened");
	}

	@OnMessage
	public synchronized void processMessage(Session sessions, String message) {
		System.out.println("received message: " + message);
		try {
			for (Session session : sessions.getOpenSessions()) {
				if (session.isOpen()) {
					session.getBasicRemote().sendText(message);
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@OnClose
	public void connectionClosed() {
		System.out.println("connection closed");
	}

}
