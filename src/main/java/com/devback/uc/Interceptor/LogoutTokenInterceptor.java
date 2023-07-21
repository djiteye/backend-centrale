package com.devback.uc.Interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class LogoutTokenInterceptor implements HandlerInterceptor {


	
	Logger log= LoggerFactory.getLogger(LogoutTokenInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		log.info("preHandle invoke ... {}:{} "+ request.getRequestURI(), request.getMethod());
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		log.info("postHandle invoke ... {}:{} "+ request.getRequestURI(), request.getMethod());
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		if(ex!=null) {
			log.error("exception inside after-compilation "+ ex.getMessage());
		}
		log.info("afterCompletion invoke ... {}:{} "+ request.getRequestURI(), request.getMethod());
	}


	
}
