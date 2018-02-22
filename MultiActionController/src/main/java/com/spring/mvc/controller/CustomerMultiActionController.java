package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CustomerMultiActionController extends MultiActionController {

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "ADD");
		modelAndView.setViewName("home");

		return modelAndView;
	}

	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "UPDATE");
		modelAndView.setViewName("home");

		return modelAndView;
	}

	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "DELETE");
		modelAndView.setViewName("home");

		return modelAndView;
	}

	public ModelAndView get(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "GET");
		modelAndView.setViewName("home");

		return modelAndView;
	}
	
	public ModelAndView addCustomer(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "ADD CUSTOMER");
		modelAndView.setViewName("home");

		return modelAndView;
	}

	public ModelAndView updateCustomer(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "UPDATE CUSTOMER");
		modelAndView.setViewName("home");

		return modelAndView;
	}

	public ModelAndView deleteCustomer(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "DELETE CUSTOMER");
		modelAndView.setViewName("home");

		return modelAndView;
	}

	public ModelAndView getCustomer(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		
		modelAndView.addObject("currentExecutingMethod", "GET CUSTOMER");
		modelAndView.setViewName("home");

		return modelAndView;
	}
}
