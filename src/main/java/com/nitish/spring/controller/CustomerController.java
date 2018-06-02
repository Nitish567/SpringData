package com.nitish.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@RequestMapping(value = "/")
	public String printWelcome() {
		 System.out.println("In Welcome");
		 System.out.println("In welcome rest");
		return "hello";

	}
}
