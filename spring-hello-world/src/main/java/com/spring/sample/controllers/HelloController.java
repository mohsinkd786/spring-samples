package com.spring.sample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path = "/message", method = RequestMethod.GET)
	public String message() {
		return "Hello World";
	}
}
