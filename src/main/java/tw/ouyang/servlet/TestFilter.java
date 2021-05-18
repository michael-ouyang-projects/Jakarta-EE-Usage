package tw.ouyang.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/test")
public class TestFilter implements Filter {

	public TestFilter() {
		System.out.println("CREATE TestFilter");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("IN FILTER");
		chain.doFilter(request, response);
		System.out.println("OUT FILTER");
	}

}
