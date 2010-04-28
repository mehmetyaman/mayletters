/**
 * 
 */
package com.mayletters.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author aykutt
 *
 */
public class MainController extends ParameterizableViewController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//Login operation here
		
		ModelAndView mav = new ModelAndView();
	    mav.setViewName("public");
	    return mav;
	}

}
