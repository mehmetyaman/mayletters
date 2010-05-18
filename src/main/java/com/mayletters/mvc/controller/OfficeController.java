package com.mayletters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfficeController {

	@RequestMapping("/office.do")
	public String redirect()
	{
		return "office";
	}
}
