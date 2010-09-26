package com.mayletters.mvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mayletters.domain.Right;
import com.mayletters.domain.User;
import com.mayletters.service.dao.RightDao;
import com.mayletters.service.dao.UserDao;

@Controller
public class RegistrationController {
	
	private Validator validator;
	
	private UserDao userDao;
	private RightDao rightDao;

	@RequestMapping(value = "/register/showform.do")
	public String showForm() {
		return "register";
	}

	@RequestMapping(value = "/register/register.do", method = RequestMethod.POST)
	@Transactional                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	public ModelAndView register(@ModelAttribute("user") User user,  BindingResult result ) {

		validator.validate(user, result);
		
		ArrayList<Right> rights = new ArrayList<Right>();
		
		rights.add(new Right(user,com.mayletters.util.Right.ADMIN));
		rights.add(new Right(user,com.mayletters.util.Right.WRITE_CARD));
		rights.add(new Right(user,com.mayletters.util.Right.WRITE_MAIL));
		
		user.setRights(rights);
		
		userDao.persist(user);
		
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()){
			// try again
			mav.setViewName("register");
			return mav;
		} else {
			// success
	        mav.setViewName("usermain");
	        mav.addObject("user", user);
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

	public void setRightDao(RightDao rightDao) {
		this.rightDao = rightDao;
	}

	public RightDao getRightDao() {
		return rightDao;
	}


}
