package com.mayletters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mayletters.domain.User;
import com.mayletters.service.dao.UserDao;

@Controller
public class RegistrationController {
	
	private Validator validator;
	private UserDao userDao;

	@RequestMapping(value = "/register/showform.do")
	public String showForm() {
		return "register";
	}

	@RequestMapping(value = "/register/register.do", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("user") User user,  BindingResult result ) {

		validator.validate(user, result);
		userDao.persist(user);
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()){
			// try again
			return mav;
		} else {
			// success
			// TODO users list will be bind here 
			
	        mav.setViewName("public");
	        mav.addObject("user", user);
	        mav.addObject("message", "Hello World From Phuong!");
	        return mav;
		}
		

	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


}
