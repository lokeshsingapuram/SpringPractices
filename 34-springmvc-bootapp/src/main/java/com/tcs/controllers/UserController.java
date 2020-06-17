package com.tcs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = {"user","user1"})
public class UserController {
	
	@GetMapping(value = {"index","index1"})
	public ModelAndView userDisplay() {
		ModelAndView view=new ModelAndView();
		view.addObject("msg", "Hey..Greetings for the day..!");
		view.setViewName("index");
		return view;
	}

}
