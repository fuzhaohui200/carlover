/*
package com.shine.carlover.filter;

import com.mapabc.newland.base.cache.RedisUserCache;
import com.mapabc.newland.base.cache.UserCache;
import com.mapabc.newland.base.cache.UserToken;
import com.mapabc.newland.base.util.RedisUtil;
import com.mapabc.newland.constant.Constant;
import com.mapabc.newland.core.po.TravelCompany;
import com.mapabc.newland.core.po.User;
import com.mapabc.newland.core.services.UserService;
import com.mapabc.newland.utils.CookieUtils;
import com.mapabc.newland.utils.Empty;
import com.mapabc.newland.utils.JsonResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

*/
/**
 * Servlet Filter implementation class UserLoginFilter
 *//*

public class UserLoginFilter implements Filter {

	private Log log = LogFactory.getLog(UserLoginFilter.class);
	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
	    HttpServletResponse response = (HttpServletResponse) servletResponse;
		String requestUrl = request.getRequestURL().toString();
		Pattern pattern = Pattern.compile(Constant.REQUEST_PATH_REG);
		 Matcher matcher = pattern.matcher(requestUrl);
         if (!matcher.find()) {
			response.setContentType("application/json;charset=UTF-8");
			HttpSession session = request.getSession();
			Object  obj = session.getAttribute("company");
			Cookie[] cookies = request.getCookies();
			try {
				String token = request.getHeader("access_token");
				if (log.isDebugEnabled()) {
					log.debug("..........用户传入的token:" + token);
				}
				if (!Empty.isEmpty(token)) { // 手机用户登录
					UserCache cache = new RedisUserCache();
					UserToken userToken = cache.getUser(token);
					if (userToken != null) {
						request.setAttribute("user", userToken);
					} else {

						WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
						UserService userService = context.getBean(UserService.class);
						User user = userService.queryUserByToken(token);
						if (user != null) {
							userToken = new UserToken(token,user);
							cache.addUser(userToken);
							request.setAttribute("user", userToken);
						} else {
							if (log.isDebugEnabled()) {
								log.debug("用户token过期或者不存在:" + token);
							}
							Constant.Result result = Constant.Result.UNLOGIN_EXCEPTION;
							response.getWriter().print(JsonResult.failure(result.getCode(), result.getMessage()));
							return;
						}
					}
				} else if(cookies != null && cookies.length > 0) { // 旅行社用户登录
					String access_token = CookieUtils.getCookie(request, "access_token");
					if(!Empty.isEmpty(access_token)) {
						String companyId = RedisUtil.hget("newland:login", access_token, Constant.REDIS_EXPRIED_TIME);
						if(companyId != null) {
							request.setAttribute("companyId", companyId);
						} else {
							Constant.Result result = Constant.Result.UNLOGIN_EXCEPTION;
							response.getWriter().print(JsonResult.failure(result.getCode(), result.getMessage()));
							return;
						}
					} else if(!Empty.isEmpty(obj)) {
						TravelCompany company = (TravelCompany) obj;
						request.setAttribute("companyId", company.getUser().getId());
					} else {
						Constant.Result result = Constant.Result.UNLOGIN_EXCEPTION;
						response.getWriter().print(JsonResult.failure(result.getCode(), result.getMessage()));
						return;
					}
				} else {
					Constant.Result result = Constant.Result.UNLOGIN_EXCEPTION;
					response.getWriter().print(JsonResult.failure(result.getCode(), result.getMessage()));
					return;
				}
			
			} catch (Exception e) {
				e.printStackTrace();
				Constant.Result result = Constant.Result.SERVER_EXCEPTION;
				response.getWriter().print(JsonResult.failure(result.getCode(), result.getMessage()));
				return;
			}
		}
		chain.doFilter(request, response);
	}

	*/
/**
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 *//*

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
*/
