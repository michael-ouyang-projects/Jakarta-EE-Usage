package tw.ouyang.jms;

import java.io.Serializable;

public class Email implements Serializable {
	private static final long serialVersionUID = 1L;

	private String to;
	private String body;

	public Email() {
		super();
	}

	public Email(String to, String body) {
		this.to = to;
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("Email{to=%s, body=%s}", getTo(), getBody());
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
