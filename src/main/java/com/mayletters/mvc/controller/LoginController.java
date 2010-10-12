/**
 * 
 */
package com.mayletters.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

import com.mayletters.domain.User;
import com.mayletters.service.dao.UserDao;

/**
 * @author aykutt
 *
 */
public class LoginController extends ParameterizableViewController {
	
	private UserDao userDao;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//Login operation here
		User u = userDao.getByUserName(request.getParameter("username"));
		System.out.println(u);
		ModelAndView mav = new ModelAndView();
//		if(username!=null&&username.trim().equals("admin")){
//				mav.setViewName("adminmain");
//		} else {
//			if(username!=null&&username.trim().equals("user")){
//				mav.setViewName("usermain");
//			}
//		}
//		if(username==null){
//			mav.setViewName("register");	
//		}
	    return mav;
	}

}
