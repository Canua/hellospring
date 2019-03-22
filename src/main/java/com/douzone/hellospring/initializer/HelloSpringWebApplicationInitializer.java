package com.douzone.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.douzone.hellospring.config.WebConfig;

public class HelloSpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// Servlet Mapping
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	// Root
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// wildcard in genericss Class<?>[]
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

}
