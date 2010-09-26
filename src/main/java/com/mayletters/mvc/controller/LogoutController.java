/**
 * 
 */
package com.mayletters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aykutt
 *
 */
@Controller
public class LogoutController {

	@RequestMapping(value = "/logout.do")
	protected String logout() throws Exception {
		
	    return "public";
	}

}
