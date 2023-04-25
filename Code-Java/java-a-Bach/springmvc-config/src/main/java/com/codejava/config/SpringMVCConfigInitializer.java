package com.codejava.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCConfigInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
