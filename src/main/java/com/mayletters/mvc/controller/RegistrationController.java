package com.mayletters.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String register(@ModelAttribute("user") User user,  BindingResult result ) {

		validator.validate(user, result);
		
		userDao.persist(user);
		
		List<User> users = userDao.listByUserName(user.getUserName());
		
		
		String redirect="main";
		
		if(result.hasErrors()){
			// try again
			return "/public/register";
		} else {
			// success
			// TODO users list will be bind here 
			return redirect;
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
