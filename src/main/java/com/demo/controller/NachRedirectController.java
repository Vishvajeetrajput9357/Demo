package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/redirect")
public class NachRedirectController {

	
	@RequestMapping(value = "/paymentLink", method = RequestMethod.GET)
	public ModelAndView paymentLink() {
		
System.out.println("hey");
		ModelAndView model = new ModelAndView();
		try {

			model.setViewName("user/CreateNach");

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;
		
	}
	
	
	
}
