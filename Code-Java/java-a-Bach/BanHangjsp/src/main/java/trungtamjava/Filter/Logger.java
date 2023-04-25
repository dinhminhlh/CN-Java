package trungtamjava.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns= {"/*"})
public class Logger implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//xu ly request
		System.out.println("xu ly o request");
		
		
		
		//xu ly response
		chain.doFilter(request, response);
		response.setContentType("text/plain");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
}