package com.mayletters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register.do")
public class RegistrationController {

//	public String redirect() {
//		return "/public/register";
//	}

	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public String onSubmit() {
		return "/public/register";
	}

}
