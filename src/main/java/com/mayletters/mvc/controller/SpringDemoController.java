package com.mayletters.mvc.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public final class SpringDemoController extends ParameterizableViewController {

	private static final Log LOG = LogFactory
			.getLog(SpringDemoController.class);

	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {
		ModelAndView ret = new ModelAndView(getViewName());
		ret.addObject("adesso",new Date());
		LOG.debug("***** Returning " + getViewName()
				+ " view with SpringDemoController *****");
		return ret;

	}
}
