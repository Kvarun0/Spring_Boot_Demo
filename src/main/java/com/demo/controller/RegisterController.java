package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@GetMapping(value="/")
	public ModelAndView load(){
		//System.out.println("Controller");
		return new ModelAndView("index","msg","Hello"); 
	}
}
