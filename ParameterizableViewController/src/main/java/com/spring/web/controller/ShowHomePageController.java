package com.spring.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class ShowHomePageController extends ParameterizableViewController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
	
		modelAndView.addObject("targetControllerName", "Parameterizable View");
		
		return modelAndView;
	}

}
