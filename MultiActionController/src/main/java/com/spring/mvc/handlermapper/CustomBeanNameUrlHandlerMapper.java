package com.spring.mvc.handlermapper;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

public class CustomBeanNameUrlHandlerMapper implements HandlerMapping {

	@Override
	public HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {

		BeanNameUrlHandlerMapping bnuhm = null;
		bnuhm = new BeanNameUrlHandlerMapping();
		
		
		HandlerExecutionChain hec = null;
		hec = new HandlerExecutionChain(bnuhm);
		
		return hec;
	}

}
