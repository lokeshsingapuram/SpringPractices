package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiActionController {
	
	@RequestMapping("/greet")
	public ModelAndView displayMsg() {
		ModelAndView view=new  ModelAndView();
		view.addObject("msg", "Hi greetings for the day...!!");
		view.setViewName("index");
		return view;
	}
	@RequestMapping("/welcome")
	public ModelAndView welcomeMsg() {
		ModelAndView view=new  ModelAndView();
		view.addObject("msg", "welcome to TCS..!!");
		view.setViewName("index");
		return view;
	}


}
