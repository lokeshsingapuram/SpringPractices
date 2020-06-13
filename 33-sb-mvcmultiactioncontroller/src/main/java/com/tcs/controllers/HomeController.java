package com.tcs.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public ModelAndView helloController() {
		ModelAndView view=new ModelAndView();
		String txtMsg="Hi greetings for the day..!!"+new Date();
		view.addObject("msg", txtMsg);
		view.setViewName("home");
		return view;
	}

}