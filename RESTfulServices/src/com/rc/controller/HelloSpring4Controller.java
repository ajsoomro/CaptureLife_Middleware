package com.rc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class HelloSpring4Controller {

	private final String CLASS_NAME = HelloSpring4Controller.class.getName();
	private final Logger logger = Logger.getLogger(HelloSpring4Controller.class); 

	@RequestMapping("/hello")  
	public ModelAndView sayHello() {

		String METHOD_NAME = CLASS_NAME+".sayHello";

		logger.info(METHOD_NAME+": start");
		String message = "Welcome to Spring 4.0 !!!";
		
		logger.info(METHOD_NAME+": end view = hello");
		return new ModelAndView("hello", "message", message);  
	}  
}
