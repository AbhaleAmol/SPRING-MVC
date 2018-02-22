package com.spring.mcv.controller;

import org.springframework.web.servlet.mvc.UrlFilenameViewController;

public class CustomeURLFileNameViewController extends UrlFilenameViewController {

	@Override
	protected String getViewNameForUrlPath(String uri) {
		System.out.println(uri);
		return "home";
	}

	
}
