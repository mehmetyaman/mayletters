package com.mayletters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RegistrationController{
	
	@RequestMapping("/register.jsp")
	public String redirect()
	{
		String redirect="register";
		return redirect;
	}


}
