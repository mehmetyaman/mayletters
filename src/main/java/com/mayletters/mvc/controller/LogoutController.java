/**
 * 
 */
package com.mayletters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author aykutt
 *
 */
@Controller
public class LogoutController extends ParameterizableViewController {

	@RequestMapping(value = "/logout.do")
	protected String logout() throws Exception {
        System.out.println("here 3");
	    return "public";
	}

}
