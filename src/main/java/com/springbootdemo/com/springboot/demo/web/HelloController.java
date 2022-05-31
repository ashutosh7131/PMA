package com.springbootdemo.com.springboot.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user_greeting", method = RequestMethod.GET)
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "<h1>hello there</h1>";
	}

	@RequestMapping(value = "/user_form", method = RequestMethod.GET)
	public String userForm() {
		return "<form action=\"/user_greeting/user_submitted\" method=GET>\r\n"
				+ "  <label for=\"fname\">First name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"firstName\"><br>\r\n"
				+ "  <label for=\"lname\">Last name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lastName\"><br><br>\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n" + "</form> ";

	}

	@RequestMapping(value = "/user_submitted", method = RequestMethod.GET)
	public String printUserGreeting(@RequestParam String firstName, @RequestParam String lastName) {
		return "Hello There : " + firstName + "    " + lastName;
	}

}
