package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.spring.mvc.bo.PersonalInfo;
import com.spring.mvc.service.PersonalInfoService;

public class DisplayDataController extends AbstractController {

	private PersonalInfoService personalInfoService;

	public void setPersonalInfoService(PersonalInfoService personalInfoService) {
		this.personalInfoService = personalInfoService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView();
		modelAndView.setViewName("display-data");
		
		List<PersonalInfo> personalInfos = null;
		personalInfos = new ArrayList<>();
		
		personalInfos = personalInfoService.getPersonalInfo();
		
		modelAndView.addObject("personalInfo", personalInfos);

		return modelAndView;
	}

}
