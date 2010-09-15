/**
 * 
 */
package com.mayletters.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author aykutt
 *
 */
public class LoginController extends ParameterizableViewController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//Login operation here
		String username=request.getParameter("username");
		ModelAndView mav = new ModelAndView();
		if(username!=null&&username.trim().equals("admin")){
				mav.setViewName("adminmain");
		} else {
			if(username!=null&&username.trim().equals("user")){
				mav.setViewName("usermain");
			}
		}
		if(username==null){
			mav.setViewName("register");	
		}
	    return mav;
	}

}
