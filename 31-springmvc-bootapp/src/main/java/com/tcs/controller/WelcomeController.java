package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView displayMsg() {
		ModelAndView view=new ModelAndView();
		view.addObject("welcome",	"welcome to spring boot");
		view.setViewName("welcome");
		return view;
	}

}
