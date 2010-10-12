/**
 * 
 */
package com.mayletters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

	@RequestMapping(value = "/logout.do")
	protected ModelAndView logout() throws Exception {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("usermain");
		mav.addObject("user", null);
		return mav;
	}

}
