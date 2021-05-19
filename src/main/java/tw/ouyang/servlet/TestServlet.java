package tw.ouyang.servlet;

import java.io.IOException;
import java.net.Inet4Address;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestServlet() {
		System.out.println("CREATE TestServlet");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Servlet: " + this.hashCode());
		HttpSession session = request.getSession();
		session.setAttribute("shoppingCart", "DATA...");
		response.getWriter().append("Served at: ").append(Inet4Address.getLocalHost().getHostAddress());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
