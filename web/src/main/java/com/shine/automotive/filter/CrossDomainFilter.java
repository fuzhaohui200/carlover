package com.shine.automotive.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CrossDomainFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.setHeader("Access-Control-Allow-Origin", "*");
		chain.doFilter(request, resp);
	}

	public void destroy() {
	}

	public void init(FilterConfig filterConfig) throws ServletException {
	}

}